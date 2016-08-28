
package com.ssthouse.fastnote.ActivityTest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ssthouse.fastnote.R;

import timber.log.Timber;

/**
 * Created by ssthouse on 16/8/26.
 */
public class TestAty2 extends AppCompatActivity {


    private TextView mTextView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Timber.e("onCreate");
        initView();
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
        mTextView.setText("activity test 2222222");
    }
}
