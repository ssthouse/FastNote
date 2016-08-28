package com.ssthouse.fastnote.ActivityTest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import timber.log.Timber;

/**
 * Created by ssthouse on 16/8/26.
 */
public class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Timber.e("onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Timber.e("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Timber.e("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Timber.e("onStop");
    }



}
