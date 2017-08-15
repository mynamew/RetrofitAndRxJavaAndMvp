package com.timi.retrofitrxjava.mvp.ui.login;

import com.timi.retrofitrxjava.bean.LoginBean;
import com.timi.retrofitrxjava.mvp.base.view.iml.MvpBaseView;

/**
 * login  view
 * author: timi
 * create at: 2017-08-15 14:19
 */
public interface LoginView extends MvpBaseView {
    /**
     * 登录的返回
     * @param bean
     */
    public void loginResult(LoginBean bean);
}
