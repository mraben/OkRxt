package com.okrxt.www.inter;


import com.okrxt.www.api.Api;
import com.okrxt.www.controller.bast.BaseApi;
import retrofit2.Retrofit;

/**
 * Description:
 * Copyright  : Copyright (c) 2017
 * Author     : Young
 * Date       : 2017/10/17 14:20 *
 */

public class ApiIn extends BaseApi {

    @Override
    public Api getObservable(Retrofit retrofit) {
        return retrofit.create(Api.class);
    }
}
