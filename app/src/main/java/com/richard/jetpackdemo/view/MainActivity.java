package com.richard.jetpackdemo.view;

import android.os.Bundle;

import com.richard.jetpackdemo.R;
import com.richard.jetpackdemo.presenter.BasePresenter;

public class MainActivity extends BaseActivity<BasePresenter> {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected BasePresenter createPresenter() {
        return new BasePresenter();
    }

    @Override
    protected void init() {
        super.init();
        getLifecycle().addObserver(presenter);
    }
}