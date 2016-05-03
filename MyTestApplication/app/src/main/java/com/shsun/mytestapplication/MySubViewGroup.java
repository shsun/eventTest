package com.shsun.mytestapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import com.shsun.common.utils.TouchEventUtil;

public class MySubViewGroup extends LinearLayout {

    public static final String TAG = "MySubViewGroup";

    public MySubViewGroup(Context context) {
        super(context);
    }

    public MySubViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("eventTest", TAG + " | OnClickListener.onClick --> "+view);
            }
        });
        /*
        this.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.e("eventTest", TAG + " | OnTouchListener.onTouch --> " + TouchEventUtil.getTouchAction(motionEvent
                        .getAction()));
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN)
                    return true;
                if (motionEvent.getAction() == MotionEvent.ACTION_MOVE)
                    return true;
                if (motionEvent.getAction() == MotionEvent.ACTION_UP)
                    return false;

                return true;
            }
        });
        */
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

        /*
        super.onTouchEvent(ev);

        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            return true;
        }
        if (ev.getAction() == MotionEvent.ACTION_MOVE) {
            return true;
        }
        if (ev.getAction() == MotionEvent.ACTION_UP) {
            return true;
        }
        */
        return true;
    }
}



