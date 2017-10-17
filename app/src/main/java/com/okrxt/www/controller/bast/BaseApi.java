package com.okrxt.www.controller.bast;

import com.okrxt.www.api.Api;
import retrofit2.Retrofit;

/**
 * Description: base接口
 * Copyright  : Copyright (c) 2017
 * Author     : Young
 * Date       : 2017/4/19.
 */

public abstract  class BaseApi {

    public String getBUrl() {
        return bUrl;
    }

    /*基础url*/
    private String bUrl ="http://server.jeasonlzy.com/";

    /**
     * 设置参数
     *
     * @param retrofit
     * @return
     */
    public abstract Api getObservable(Retrofit retrofit);
}
