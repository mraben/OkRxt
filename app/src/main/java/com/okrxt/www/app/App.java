package com.okrxt.www.app;

import android.app.Application;
import android.content.Context;

/**
 * Description: 自定义Application
 */

public class App extends Application {

    public  static Context appCon;

    @Override
    public void onCreate() {
        super.onCreate();
        appCon = getApplicationContext();
    }

}
