package com.richard.jetpackdemo.view;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import com.richard.jetpackdemo.R;

public class LiveDataRecActivity extends AppCompatActivity {

    public static final String TAG = "LiveDataRecActivityTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livedata_rec);

        LiveDataActivity.liveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                s += s;
                Log.i(TAG, "liveData receive data " + s);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
