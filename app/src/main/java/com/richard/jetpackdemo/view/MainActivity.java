package com.richard.jetpackdemo.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.richard.jetpackdemo.R;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}