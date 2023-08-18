package com.richard.jetpackdemo.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import com.richard.jetpackdemo.R;

public class LiveDataActivity extends AppCompatActivity {

    public static final String TAG = "LiveDataActivity";

    public static MutableLiveData liveData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livedata);
        liveData = new MutableLiveData();

        liveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.i(TAG,"liveData receive data " + s);
            }
        });
    }

    public void mainClick(View view) {
        liveData.setValue("mainClick");
    }

    public void threadClick(View view) {
        new Thread() {
            @Override
            public void run() {
                liveData.postValue("threadClick");
            }
        }.start();
    }

}
