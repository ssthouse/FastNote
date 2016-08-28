package com.ssthouse.fastnote.ActivityTest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.ssthouse.fastnote.R;

import timber.log.Timber;

/**
 * Created by ssthouse on 16/8/26.
 */
public class TestAty1 extends AppCompatActivity {

    private TextView mTextView;

    private EditText mEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Timber.e("onCreate");
        setContentView(R.layout.activity_test_1);
        initView();

        int x = -0x11;
        double y = 2389.23E-100;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Timber.e("onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Timber.e("onRestoreInstanceState");
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

    @Override
    protected void onRestart() {
        super.onRestart();
        Timber.e("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Timber.e("onDestroy");
    }



    private void initView() {
        mTextView = (TextView) findViewById(R.id.id_tv);
        mTextView.setText("activity test 111111");

        //点击出现另一个activity
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TestAty1.this, TestAty2.class));
            }
        });

        mEditText = (EditText) findViewById(R.id.id_et);
    }
}
