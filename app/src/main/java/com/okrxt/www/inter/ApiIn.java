package com.okrxt.www.inter;


import com.okrxt.www.api.Api;
import com.okrxt.www.controller.bast.BaseApi;
import retrofit2.Retrofit;

/**
 * Description:
 */

public class ApiIn extends BaseApi {

    @Override
    public Api getObservable(Retrofit retrofit) {
        return retrofit.create(Api.class);
    }
}
