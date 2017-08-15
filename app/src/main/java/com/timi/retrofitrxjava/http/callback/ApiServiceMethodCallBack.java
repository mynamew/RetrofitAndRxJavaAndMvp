package com.timi.retrofitrxjava.http.callback;

import com.timi.retrofitrxjava.http.api.ApiService;

import io.reactivex.Observable;
import okhttp3.ResponseBody;

/**
 * api setvice 的回调
 * author: timi
 * create at: 2017-08-15 10:56
 */
public interface ApiServiceMethodCallBack {
    Observable<ResponseBody> createObservable(ApiService apiService);
}
