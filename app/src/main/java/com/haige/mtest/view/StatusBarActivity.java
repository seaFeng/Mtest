package com.haige.mtest.view;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.haige.mtest.R;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import es.dmoral.toasty.Toasty;

public class StatusBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_bar);
        intView();
    }

    private void intView() {
        // 手机下面导航栏
        //navigationColor();
        // 状态栏
        statusBar();
    }

    private void statusBar() {
        int resourceId = getResources().getIdentifier("status_bar_height","dimen","android");
        int statusHeight = getResources().getDimensionPixelSize(resourceId);
        Toasty.info(this,"状态栏的高度" + statusHeight).show();
    }

    public void mClick(View v) {
        switch(v.getId()) {
            case R.id.ac_status_hide:
                getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
                break;
        }
    }

    private void navigationColor() {
        boolean isHave = false;
        Resources rs = getResources();
        int id = rs.getIdentifier("config_showNavigationBar","bool","android");
        if (id > 0) {
            isHave = rs.getBoolean(id);
        }
        try {
            Class systemPropertiesClass = Class.forName("android.os.SystemProperties");
            Method m = null;
            try {
                m = systemPropertiesClass.getMethod("get",String.class);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            String navBaroverride = null;
            try {
                navBaroverride = (String) m.invoke(systemPropertiesClass,"qemu.hw.mainkeys");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            if ("1".equals(navBaroverride)) {
                isHave = true;
            } else if ("0".equals(navBaroverride)) {
                isHave = true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (isHave) {
            Toasty.info(this,"有虚拟键").show();
        } else {
            Toasty.info(this,"没有虚拟键").show();
        }
    }
}
