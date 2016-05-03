package com.shsun.mytestapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import com.shsun.common.utils.TouchEventUtil;

public class MySuperViewGroup extends LinearLayout {

    public static final String TAG = "MySuperViewGroup";

    public MySuperViewGroup(Context context) {
        super(context);
    }

    public MySuperViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("eventTest", TAG + " | dispatchTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("eventTest", TAG + " | onInterceptTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.d("eventTest", TAG + " | onTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
        if(ev.getAction()==MotionEvent.ACTION_DOWN){
			return false;
		}
		if(ev.getAction()==MotionEvent.ACTION_UP){
			return true;
		}
        return super.onTouchEvent(ev);
    }

}
