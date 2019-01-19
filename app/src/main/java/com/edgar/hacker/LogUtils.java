package com.edgar.hacker;

import android.util.Log;

public class LogUtils {

    private static final String TAG = "LogUtils";
    public LogUtils() {}

    public static void e(String message) {
        Log.e(TAG, message);
    }
}
