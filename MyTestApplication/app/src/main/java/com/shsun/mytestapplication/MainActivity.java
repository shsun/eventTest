package com.shsun.mytestapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import com.shsun.common.utils.TouchEventUtil;

public class MainActivity extends ActionBarActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * return false if you want to disable interaction in this activity, otherwise return true.
     *
     * @param ev
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.w("eventTest", TAG + " | dispatchTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
        return super.dispatchTouchEvent(ev);
    }

    // there is no onInterceptTouchEvent(MotionEvent ev) in Activity

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.w("eventTest", TAG + " | onTouchEvent --> " + TouchEventUtil.getTouchAction(event.getAction()));
        return super.onTouchEvent(event);
    }
}
