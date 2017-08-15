package com.timi.retrofitrxjava.mvp.ui.login;

import com.timi.retrofitrxjava.bean.LoginBean;
import com.timi.retrofitrxjava.http.HttpRequestManager;
import com.timi.retrofitrxjava.http.api.ApiService;
import com.timi.retrofitrxjava.http.callback.ApiServiceMethodCallBack;
import com.timi.retrofitrxjava.mvp.base.model.impl.MvpBaseModel;

import io.reactivex.Observable;
import io.reactivex.Observer;
import okhttp3.ResponseBody;

/**
 * 登录的model
 * author: timi
 * create at: 2017-08-15 14:16
 */
public class LoginModel extends MvpBaseModel {
    /** 
      * 登录的方法
      * author: timi    
      * create at: 2017/8/15 14:26
      */  
    public void login(final String username, final String password, Observer<LoginBean> observer) {
        HttpRequestManager.getInstance().HttpRequestManagerRequestByWebservice(observer, LoginBean.class, new ApiServiceMethodCallBack() {
            @Override
            public Observable<ResponseBody> createObservable(ApiService apiService) {
                return apiService.login(username, password);
            }
        });
    }
}
