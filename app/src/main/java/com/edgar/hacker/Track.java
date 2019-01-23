package com.edgar.hacker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;

public class Track {

    private static final String TAG = "LogUtils";
    public Track() {}

    public static void e(String message) {
        Log.e(TAG, message);
    }

    public static void onClick(View v) {
        Log.d(TAG,"click:"+v);
    }

    public static void onFragmentHiddenChanged(Fragment fragment, boolean isHideChanged) {
        Log.d(TAG,"onFragmentHiddenChanged");
    }

    public static void setFragmentUserVisibleHint(Fragment fragment, boolean isUserVisibleHint) {
        Log.d(TAG,"setFragmentUserVisibleHint");
    }

    public static void onStartActivityForResult(Fragment fragment, Intent intent, int requestCode, Bundle options) {}
}
