package com.timi.retrofitrxjava.mvp.ui.login;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.timi.retrofitrxjava.R;
import com.timi.retrofitrxjava.bean.LoginBean;
import com.timi.retrofitrxjava.mvp.base.BaseActivity;
import com.timi.retrofitrxjava.uils.Constants;

public class LogInActivity extends BaseActivity<LoginView, LoginPresenter> implements LoginView {
    private TextView tv_result;

    @Override
    public int setLayoutId() {
        return R.layout.activity_log_in;
    }

    @Override
    public void initBundle(Bundle savedInstanceState) {
        //设置base url
        Constants.BASE_URL = "http://222.92.132.196:9000/index.asmx/";
    }

    @Override
    public void initView() {
        tv_result = (TextView) findViewById(R.id.tv_result);
    }

    @Override
    public void initData() {

    }

    @Override
    public LoginPresenter createPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    public LoginView createView() {
        return this;
    }

    @Override
    public void loginResult(LoginBean bean) {
        //设置返回的数据
        tv_result.setText("登录成功\n" + "用户名：" + bean.getData().get(0).getUser_name());
    }

    public void login(View view) {
        getPresenter().login("gep", "a12345678");
    }
}
