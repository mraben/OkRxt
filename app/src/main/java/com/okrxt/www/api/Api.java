package com.okrxt.www.api;

import okhttp3.ResponseBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Description: api接口
 */

public interface Api {

    @FormUrlEncoded
    @POST("OkHttpUtils/method")
    Observable<ResponseBody> login(@Field("param1") String param);

}

