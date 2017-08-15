package com.timi.retrofitrxjava.mvp.ui.login;

import android.content.Context;

import com.timi.retrofitrxjava.bean.LoginBean;
import com.timi.retrofitrxjava.http.callback.OnResultCallBack;
import com.timi.retrofitrxjava.http.subscriber.HttpSubscriber;
import com.timi.retrofitrxjava.mvp.base.presenter.impl.MvpBasePresenter;

import io.reactivex.Observer;

/**
 * login  presenter
 * author: timi
 * create at: 2017-08-15 14:21
 */
public class LoginPresenter extends MvpBasePresenter<LoginView> {
    private LoginModel model = null;
    private HttpSubscriber<LoginBean> loginBeanHttpSubscriber = null;

    /**
     * 初始化
     *
     * @param context
     */
    public LoginPresenter(Context context) {
        super(context);
        this.model = new LoginModel();
        if (null == loginBeanHttpSubscriber) {
            loginBeanHttpSubscriber = new HttpSubscriber<LoginBean>(new OnResultCallBack<LoginBean>() {
                @Override
                public void onSuccess(LoginBean bean) {
                    //传递 返回的数据
                    getView().loginResult(bean);
                }

                @Override
                public void onError(String errorMsg) {
                    // TODO: 2017/8/15 去显示某些错误信息  包括网络请求超时等
                }
            });
        }
    }

    /**
     * 登录
     *
     * @param username
     * @param password
     */
    public void login(String username, String password) {
        model.login(username, password, loginBeanHttpSubscriber);
    }

    /**
     * 解除 view
     */
    @Override
    public void dettachView() {
        super.dettachView();
        //反注册
        if (null != loginBeanHttpSubscriber) {
            loginBeanHttpSubscriber.unSubscribe();
            loginBeanHttpSubscriber = null;
        }
    }
}
