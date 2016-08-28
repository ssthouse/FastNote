package com.ssthouse.fastnote.IntentServiceTest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ssthouse.fastnote.Constant;
import com.ssthouse.fastnote.R;

/**
 * Created by ssthouse on 16/8/26.
 */
public class TestIntentServiceAty extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_inent_service);

        //启动IntentService
        //查看其运行情况
        Intent serviceIntent1 = new Intent(Constant.INTENT_NAME);
        Bundle bundle1 = new Bundle();
        bundle1.putString(IntentServiceDemo.KEY_PARAM, IntentServiceDemo.PARAM_OPERATION_ONE);
        serviceIntent1.putExtra(IntentServiceDemo.BUNDLE_NAME, bundle1);
        startService(serviceIntent1);


        Intent serviceIntent2 = new Intent(Constant.INTENT_NAME);
        Bundle bundle2 = new Bundle();
        bundle2.putString(IntentServiceDemo.KEY_PARAM, IntentServiceDemo.PARAM_OPERATION_TWO);
        serviceIntent2.putExtra(IntentServiceDemo.BUNDLE_NAME, bundle2);
        startService(serviceIntent2);
    }
}
