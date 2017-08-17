package com.timi.retrofitrxjava.uils;

import android.content.Context;
import android.content.SharedPreferences;

import com.timi.retrofitrxjava.mvp.base.BaseApplication;


/**
 * sharepreference 的工具类
 * author: timi
 * create at: 2017-08-15 18:12
 */
public class SpUtils {
    //shaeperference
    private SharedPreferences mPreference = null;
    //实例
    //shareperference的名字
    private String SHAREPERFERECE_NAME = "config";
    //editor
    private SharedPreferences.Editor editor = null;

    private SpUtils() {

    }

    private static class LazyHolder {
        private static final SpUtils INSTANCE = new SpUtils();
    }

    public static final SpUtils getInstance() {
        return LazyHolder.INSTANCE;
    }

    /**
     * 获取shareperference实例
     *
     * @return
     */
    public SharedPreferences getSharedPreferences() {
        if (null == mPreference) {
            mPreference = BaseApplication.getMApplicationContext().getSharedPreferences(SHAREPERFERECE_NAME, Context.MODE_PRIVATE);
            editor = mPreference.edit();
        }
        return mPreference;
    }

    /**
     * 存入 字符串
     *
     * @param key
     * @param value
     */
    public SpUtils putString(String key, String value) {
        getSharedPreferences();
        editor.putString(key, value).commit();
        return this;
    }

    /**
     * 获取字符串的value
     *
     * @param key
     * @return
     */
    public String getString(String key) {
        getSharedPreferences();
        return mPreference.getString(key, "");
    }

    /**
     * 存入 整形
     *
     * @param key
     * @param value
     */
    public SpUtils putInt(String key, int value) {
        getSharedPreferences();
        editor.putInt(key, value).commit();
        return this;
    }

    /**
     * 获取整形的value
     *
     * @param key
     * @return
     */
    public int getInt(String key) {
        getSharedPreferences();
        return mPreference.getInt(key, 0);
    }

    /**
     * 存储 float 类型
     *
     * @param key
     * @param value
     */
    public SpUtils putFloat(String key, float value) {
        getSharedPreferences();
        editor.putFloat(key, value).commit();
        return this;
    }

    /**
     * 获取 float 类型value
     *
     * @param key
     * @return
     */
    public float getFloat(String key) {
        getSharedPreferences();
        return mPreference.getFloat(key, 0);
    }

    /**
     * 存储布尔类型数据
     *
     * @param key
     * @param value
     */
    public SpUtils putBoolean(String key, boolean value) {
        getSharedPreferences();
        editor.putBoolean(key, value).commit();
//        Logger.d("存入的boolean 型数据--->"+mPreference.getBoolean(key,false));
        return this;
    }

    /**
     * 获取 布尔类型value
     *
     * @param key
     * @return
     */
    public boolean getBoolean(String key) {
        getSharedPreferences();
        return mPreference.getBoolean(key, false);
    }
}
