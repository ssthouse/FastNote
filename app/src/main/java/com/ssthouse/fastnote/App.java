package com.ssthouse.fastnote;

import android.app.Application;

import im.fir.sdk.FIR;
import timber.log.Timber;

/**
 * Created by ssthouse on 2015/12/13.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
//        Timber.plant(new Timber.DebugTree());
        Timber.plant(new Timber.DebugTree());
        FIR.init(this);
    }
}
