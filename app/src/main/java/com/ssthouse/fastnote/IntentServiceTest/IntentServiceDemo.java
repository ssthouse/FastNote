package com.ssthouse.fastnote.IntentServiceTest;

import android.app.IntentService;
import android.content.Intent;

import timber.log.Timber;

/**
 * Created by ssthouse on 16/8/26.
 */
public class IntentServiceDemo extends IntentService {


    public static final String BUNDLE_NAME = "bundle";
    public static final String KEY_PARAM = "param";
    public static final String PARAM_OPERATION_ONE = "operation1";
    public static final String PARAM_OPERATION_TWO = "operation2";

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.e("on create");
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Timber.e("on start");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Timber.e("on start command");
        return super.onStartCommand(intent, flags, startId);
    }

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public IntentServiceDemo(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        String paramName = intent.getBundleExtra(BUNDLE_NAME).getString(KEY_PARAM);
        if (paramName == null) {
            Timber.e("wrong param name ");
            return;
        }
        if (paramName.equals(PARAM_OPERATION_ONE)) {
            Timber.e("on handle operation 1");
        }else if(paramName.equals(PARAM_OPERATION_TWO)){
            Timber.e("on handle operation 2");
        }
    }
}
