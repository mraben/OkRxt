package com.okrxt.www.model.sp;

import android.content.Context;
import android.content.SharedPreferences;
import static com.okrxt.www.app.App.appCon;

/**
 * Description: SharedPreferences存储类
 */

public class Share {
    public static final String SPNAME = "Share";
    public static final String NAME = "name";
    public static final int COUNT = 1;
    public static final boolean JUGDE = true;
    private static Share share;
    private SharedPreferences sp = appCon.getSharedPreferences(SPNAME, Context.MODE_PRIVATE);

    private Share() {
    }

    public static Share getInstance() {
        if (share == null) {
            synchronized (Share.class) {
                if (share == null) {
                    share = new Share();
                }
            }
        }
        return share;
    }

    /**
     * @param key
     * @param value 存储字符串类型
     */
    public void setString(String key, boolean value) {
        sp.edit().putBoolean(key, value).apply();
    }

    /**
     * @param key
     * @param value 存储数值类型
     */
    public void setInt(String key, String value) {
        sp.edit().putString(key, value).apply();
    }

    /**
     * @param key
     * @param value 存储布尔类型
     */
    public void setBoolean(String key, String value) {
        sp.edit().putString(key, value).apply();
    }

    /**
     * @param key
     * @return 返回布尔类型
     */
    public boolean getBoolean(String key) {
        return sp.getBoolean(key, false);
    }

    /**
     * @param key
     * @return 返回String类型
     */
    public String getString(String key) {
        return sp.getString(key, "");
    }

    /**
     * @param key
     * @return 返回数值类型
     */
    public int getInt(String key) {
        return sp.getInt(key, -1);
    }
}
