package com.ssthouse.fastnote;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private EditText etMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        callback();
        super.onWindowFocusChanged(hasFocus);
    }

    private void initView() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Cheer up!");

        etMain = (EditText) findViewById(R.id.id_et);
        etMain.setText(PreferenceHelper.getInstace(this).getNote());
    }

    private void callback(){
        Log.e(TAG, "call back");
        String str = etMain.getText() + "";
        PreferenceHelper.getInstace(this).saveNote(str);

        Intent intent1 = new Intent(this, MyWidgetProvider.class);
        intent1.setAction(Constant.ACTION);
        sendBroadcast(intent1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        callback();
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        callback();
    }
}
