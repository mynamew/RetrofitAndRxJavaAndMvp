package com.timi.retrofitrxjava.mvp.base;

import android.app.Application;
import android.content.Context;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;


/**
 * base  appliacation
 */

public class BaseApplication extends Application {
    public static  Application mApplication = null;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
        //初始化 Log
        Logger.addLogAdapter(new AndroidLogAdapter());
//        LogUitls.d("程序是否是 debug状态--->"+IS_DEBUG);
    }

    /**
     * 获取 application context
     * @return
     */
    public static Context getMApplicationContext() {
        return mApplication.getApplicationContext();
    }
}
