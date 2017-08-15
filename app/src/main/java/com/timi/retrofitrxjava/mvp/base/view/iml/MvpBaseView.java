package com.timi.retrofitrxjava.mvp.base.view.iml;


import com.timi.retrofitrxjava.mvp.base.view.MvpView;

/**
 * mvp 的base  实现类
 */

public interface MvpBaseView extends MvpView {
    void showProgressDialog();

    void dismisProgressDialog();
}
