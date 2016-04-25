package com.ssthouse.fastnote;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.OnColorSelectedListener;
import com.flask.colorpicker.builder.ColorPickerClickListener;
import com.flask.colorpicker.builder.ColorPickerDialogBuilder;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private EditText etMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (PreferenceHelper.getInstance(this).isFistIn()) {
            PreferenceHelper.getInstance(this).setIsFistIn(false);
            PreferenceHelper.getInstance(this).setColor(0xffffffff);
            PreferenceHelper.getInstance(this).saveNote("begin fast note");
        }

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
        etMain.setText(PreferenceHelper.getInstance(this).getNote());
    }

    private void callback() {
        String str = etMain.getText() + "";
        PreferenceHelper.getInstance(this).saveNote(str);

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
        switch (id) {
            case R.id.id_action_color_pick:
                //TODO---选择颜色
                pickColor();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * 选择颜色
     */
    private void pickColor() {
        ColorPickerDialogBuilder
                .with(this)
                .setTitle("Choose color")
                .initialColor(PreferenceHelper.getInstance(this).getColor())
                .wheelType(ColorPickerView.WHEEL_TYPE.FLOWER)
                .density(12)
                .setOnColorSelectedListener(new OnColorSelectedListener() {
                    @Override
                    public void onColorSelected(int selectedColor) {
                        // toast("onColorSelected: 0x" + Integer.toHexString(selectedColor));
                    }
                })
                .setPositiveButton("确定", new ColorPickerClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int selectedColor, Integer[] allColors) {
                        //保存选择的颜色
                        PreferenceHelper.getInstance(MainActivity.this).setColor(selectedColor);
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .build()
                .show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        callback();
    }
}
