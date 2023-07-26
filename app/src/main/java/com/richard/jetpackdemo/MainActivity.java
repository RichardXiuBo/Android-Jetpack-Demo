package com.richard.jetpackdemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    MutableLiveData<String> mutableLiveData1;
    MutableLiveData<String> mutableLiveData2;
    MutableLiveData<Boolean> liveDataSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        // demo 1
//        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
//        mutableLiveData.observe(this, new Observer<String>() {//1
//            @Override
//            public void onChanged(@Nullable final String s) {
//                Log.d(TAG, "onChanged, " + s);
//            }
//        });
//        mutableLiveData.postValue("Android Jetpack MutableLiveData demo");//2
//
//        // demo 2
//        mutableLiveData.observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable final String s) {
//                Log.d(TAG, "onChanged1, " + s);
//            }
//        });

//        // use Transformations.map to change value
//        LiveData transformedLiveData = Transformations.map(mutableLiveData, new Function<String, Object>() {
//            @Override
//            public Object apply(String name) {
//                return name + " + Android Richard step 1";
//            }
//        });
//
//        transformedLiveData.observe(this, new Observer() {
//            @Override
//            public void onChanged(@Nullable Object o) {
//                Log.d(TAG, "onChanged2, " + o.toString());
//            }
//        });
//        mutableLiveData.postValue("Android Richard step 2");
//
//        // output
//        // onChanged, Android Richard step 2
//        // onChanged1, Android Richard step 2
//        // onChanged2, Android Richard step 2 + Android Richard step 1

        mutableLiveData1 = new MutableLiveData<>();
        mutableLiveData2 = new MutableLiveData<>();
        liveDataSwitch = new MutableLiveData<Boolean>();//1

        LiveData transformedLiveData = Transformations.switchMap(liveDataSwitch, new Function<Boolean, LiveData<String>>() {
            @Override
            public LiveData<String> apply(Boolean input) {
                if (input) {
                    return mutableLiveData1;
                } else {
                    return mutableLiveData2;
                }
            }
        });

        transformedLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable final String s) {
                Log.d(TAG, "onChanged, " + s);
            }
        });
        liveDataSwitch.postValue(false);//2
        mutableLiveData1.postValue("Android Richard step 1");
        mutableLiveData2.postValue("Android Richard step 2");
    }
}