package com.richard.jetpackdemo.presenter;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

public class BasePresenter implements LifecycleObserver{
    public static final String TAG = "BasePresenter";

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreateX(LifecycleOwner owner) {
        Log.d(TAG, "onCreateX");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStartX(LifecycleOwner owner) {
        Log.d(TAG, "onStartX");
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop(LifecycleOwner owner) {
        Log.d(TAG, "onStop");
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume(LifecycleOwner owner) {
        Log.d(TAG, "onResume");
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause(LifecycleOwner owner) {
        Log.d(TAG, "onPause");
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestory(LifecycleOwner owner) {
        Log.d(TAG, "onDestory");
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    void onAny(LifecycleOwner owner) {
    }

}
