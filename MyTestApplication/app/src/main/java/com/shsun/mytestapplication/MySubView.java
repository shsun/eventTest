package com.shsun.mytestapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.shsun.common.utils.TouchEventUtil;

/**
 * Created by shsun on 2/5/16.
 */
public class MySubView extends Button {

    public static final String TAG = "MySubView";


    public MySubView(Context context) {
        super(context);
        Log.e("eventTest", "new " + TAG + " 1");
    }

    public MySubView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.e("eventTest", "new " + TAG + " 2");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("eventTest", TAG + " | dispatchTouchEvent --> " + TouchEventUtil.getTouchAction(ev
                .getAction()));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.d("eventTest", TAG + " | onTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            return true;
        }
        if (ev.getAction() == MotionEvent.ACTION_UP) {
            return true;
        }
        return super.onTouchEvent(ev);
    }

}
