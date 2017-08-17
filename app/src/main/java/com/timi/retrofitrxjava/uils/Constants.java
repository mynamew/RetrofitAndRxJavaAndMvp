package com.timi.retrofitrxjava.uils;

import com.timi.retrofitrxjava.mvp.base.BaseApplication;

import static com.timi.retrofitrxjava.uils.PackageUtils.isApkDebugable;

/**
 * 静态常量
 * author: timi
 * create at: 2017-08-15 10:27
 */
public class Constants {
    //base  URL
    public static String BASE_URL = "http://v.juhe.cn/weixin/";
    //    public  static String BASE_WEBSERVICE_URL="http://222.92.132.196:9000/index.asmx/";
    //状态栏颜色
    public static final String StatusColorStr = "#303F9F";
    //是否是 debug的状态
    public static final boolean IS_DEBUG = isApkDebugable(BaseApplication.getMApplicationContext());

}
