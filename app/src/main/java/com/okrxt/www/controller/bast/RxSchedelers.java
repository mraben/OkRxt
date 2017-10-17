package com.okrxt.www.controller.bast;

import com.okrxt.www.utils.LogUtil;

import rx.Subscriber;

/**
 * Description: 自定义Subscriber
 * Copyright  : Copyright (c) 2017
 * Author     : Young
 * Date       : 2017/10/17 15:12 *
 */

public class RxSchedelers<T> extends Subscriber<T> {

    @Override
    public void onCompleted() {
        LogUtil.e("TAG","请求完成");
    }

    @Override
    public void onError(Throwable e) {
        LogUtil.e("TAG","请求异常"+e.getMessage());
    }

    @Override
    public void onNext(T t) {

    }

}
