package com.okrxt.www.model;

import com.google.gson.Gson;
import com.okrxt.www.api.Api;
import com.okrxt.www.controller.bast.BaseRetrofit;
import com.okrxt.www.controller.bast.RxSchedelers;
import com.okrxt.www.inter.ApiIn;
import com.okrxt.www.model.bean.Bean;
import com.okrxt.www.utils.LogUtil;
import org.greenrobot.eventbus.EventBus;
import java.io.IOException;
import okhttp3.ResponseBody;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Description: 处理请求
 * Copyright  : Copyright (c) 2017
 * Author     : Young
 * Date       : 2017/10/17 14:20 *
 */
public class Model {
    private static Model model;
    private Api api = BaseRetrofit.getInstance().getObservable(new ApiIn());
    private Gson gson = new Gson();

    /**
     * @return 返回Model实例
     */
    public static Model getInstance() {

        if (model == null) {
            synchronized (Model.class) {
                if (model == null) {
                    model = new Model();
                }
            }
        }
        return model;
    }

    /**
     * 登录页面请求
     */
    public void apiLogin(String password) {
        Observable<ResponseBody> login = api.login(password);
        login.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new RxSchedelers<ResponseBody>(){
                    @Override
                    public void onNext(ResponseBody responseBody) {
                        super.onNext(responseBody);
                        try {
                            String string = responseBody.string();
                            Bean bean = gson.fromJson(string, Bean.class);
                            EventBus.getDefault().post(bean);
                        } catch (IOException e) {
                            e.printStackTrace();
                            LogUtil.e("数据异常："+e.getMessage());
                        }
                    }
                });
    }

}