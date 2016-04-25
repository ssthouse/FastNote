package com.ssthouse.fastnote;

import android.app.Application;

import im.fir.sdk.FIR;

/**
 * Created by ssthouse on 2015/12/13.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FIR.init(this);
    }
}
