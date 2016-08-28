package com.ssthouse.fastnote.NotificationTest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ssthouse.fastnote.R;

/**
 * Created by ssthouse on 16/8/27.
 */
public class NotificationTestAty extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify_test);
        initView();
    }

    private void initView() {
        findViewById(R.id.id_btn_post_notify).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            }
        });
    }
}
