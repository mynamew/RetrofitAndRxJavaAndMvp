package com.timi.retrofitrxjava.mvp.base;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.timi.retrofitrxjava.mvp.base.presenter.MvpPresenter;
import com.timi.retrofitrxjava.mvp.base.view.MvpView;
import com.timi.retrofitrxjava.mvp.base.view.iml.MvpBaseView;
import com.timi.retrofitrxjava.uils.Constants;
import com.timi.retrofitrxjava.uils.statusutils.StatusBarUtil;


/**
 * 所有Acitity的基类  封装基类的方法
 */
public abstract class BaseActivity<V extends MvpView, P extends MvpPresenter<V>> extends AppCompatActivity implements MvpBaseView {

    private P presenter;
    private V view;

    public P getPresenter() {
        return presenter;
    }

    public V getView() {
        return view;
    }
    //当前Activity的实例
    public Activity currentActivity;
    public String TAG = "";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutId());
        if (this.presenter == null) {
            this.presenter = createPresenter();
        }
        if (this.view == null) {
            this.view = createView();
        }
        if (this.presenter != null && this.view != null) {
            this.presenter.attachView(view);
        }
        //current activity
        currentActivity = this;
        //tag
        TAG = currentActivity.getClass().getSimpleName()+"_";
        //设置状态栏颜色 默认
        StatusBarUtil.setColor(this, Color.parseColor(Constants.StatusColorStr));
        //初始化各种数据
        initBundle(savedInstanceState);
        initView();
        initData();
    }

    /**
     * 展示 进度条
     */
    @Override
    public void showProgressDialog() {

    }

    /**
     * 隐藏进度条
     */
    @Override
    public void dismisProgressDialog() {

    }
    //设置布局id
    public abstract int setLayoutId();
    //初始化bundle
    public abstract void initBundle(Bundle savedInstanceState);
    //初始化View
    public abstract void initView();
    //初始化数据
    public abstract void initData();
    /**
     * 绑定P层
     *
     * @return
     */
    public abstract P createPresenter();

    /**
     * 创建View层
     *
     * @return
     */
    public abstract V createView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (this.presenter != null) {
            this.presenter.dettachView();
            this.presenter = null;
        }
    }
}
