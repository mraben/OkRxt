package com.okrxt.www.app;

import android.app.Application;
import android.content.Context;

/**
 * Description: 自定义Application
 * Copyright  : Copyright (c) 2017
 * Author     : Young
 * Date       : 2017/10/17 14:20 *
 */

public class App extends Application {

    public  static Context appCon;

    @Override
    public void onCreate() {
        super.onCreate();
        appCon = getApplicationContext();
    }

}
