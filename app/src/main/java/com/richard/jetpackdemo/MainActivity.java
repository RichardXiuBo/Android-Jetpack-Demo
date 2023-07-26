package com.richard.jetpackdemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.observe(this, new Observer<String>() {//1
            @Override
            public void onChanged(@Nullable final String s) {
                Log.d(TAG, "onChanged, " + s);
            }
        });
        mutableLiveData.postValue("Android Jetpack MutableLiveData demo");//2
    }
}