package com.timi.retrofitrxjava.mvp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.timi.retrofitrxjava.R;
import com.timi.retrofitrxjava.bean.TestBean1;
import com.timi.retrofitrxjava.http.HttpRequestManager;
import com.timi.retrofitrxjava.http.api.ApiService;
import com.timi.retrofitrxjava.http.callback.ApiServiceMethodCallBack;
import com.timi.retrofitrxjava.http.callback.OnResultCallBack;
import com.timi.retrofitrxjava.http.subscriber.HttpSubscriber;
import com.timi.retrofitrxjava.mvp.ui.login.LogInActivity;
import com.timi.retrofitrxjava.uils.Constants;

import io.reactivex.Observable;
import okhttp3.ResponseBody;

public class MainActivity extends AppCompatActivity {
    private TextView tv_content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_content = (TextView) findViewById(R.id.tv_content);
        Constants.BASE_URL="http://v.juhe.cn/weixin/";

    }

    public void request(View view) {
        //测试普通网络请求
        getNormalHttp();
    }

    /**
     * 测试普通的网络请求
     * author: timi
     * create at: 2017/8/15 13:51
     */
    public void getNormalHttp() {
        HttpRequestManager.getInstance().HttpRequestManagerRequest(new HttpSubscriber<TestBean1>(new OnResultCallBack<TestBean1>() {
            @Override
            public void onSuccess(TestBean1 testBean1) {
                if (null != testBean1) {
                    tv_content.setText(testBean1.getResult().getList().toString() + "");
                }
            }

            @Override
            public void onError(String errorMsg) {

            }
        }), TestBean1.class, new ApiServiceMethodCallBack() {
            @Override
            public Observable<ResponseBody> createObservable(ApiService apiService) {
                return apiService.getDatas(1, 10, "json1");
            }
        });
    }

    /**
     * 测试普通的网络请求
     * author: timi
     * create at: 2017/8/15 13:51
     */
    public void jumpToLoginActivty(View view) {
        startActivity(new Intent(MainActivity.this, LogInActivity.class));
    }
}
