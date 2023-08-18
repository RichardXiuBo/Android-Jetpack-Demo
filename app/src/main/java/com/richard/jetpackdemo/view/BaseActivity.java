package com.richard.jetpackdemo.view;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.richard.jetpackdemo.presenter.BasePresenter;


public abstract class BaseActivity<T extends BasePresenter>  extends AppCompatActivity {
    protected T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //由activity选择一个表示层
        presenter=createPresenter();
        init();

    }
    protected abstract T createPresenter();

    protected void init(){

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}
