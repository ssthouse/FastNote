package com.ssthouse.fastnote;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by ssthouse on 2015/12/9.
 */
public class PreferenceHelper {

    private static PreferenceHelper preferenceHelper;

    private SharedPreferences sharedPreferences;

    private static final String KEY = "key";

    private PreferenceHelper(Context context){
        sharedPreferences = context.getSharedPreferences("preference", Context.MODE_PRIVATE);
    }

    public static PreferenceHelper getInstace(Context context){
        if(preferenceHelper == null){
            preferenceHelper = new PreferenceHelper(context);
        }
        return preferenceHelper;
    }

    public void saveNote(String note){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY, note);
        editor.commit();
    }

    public String getNote(){
        return sharedPreferences.getString(KEY, "");
    }
}
