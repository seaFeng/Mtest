package com.haige.mtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.haige.mtest.MaterialDesign.CoordinatorLayoutActivity;
import com.haige.mtest.MaterialDesign.MetrialThemeActivity;
import com.haige.mtest.Toasty.ToastyActivity;
import com.haige.mtest.path.PathActivity;
import com.haige.mtest.textview.OwnTextViewActivity;
import com.haige.mtest.time.TimePickActivity;
import com.haige.mtest.view.StatusBarActivity;
import com.haige.mtest.view.ViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.main_path:
                startActivity(new Intent(this, PathActivity.class));
                break;
            case R.id.main_toast:
                startActivity(new Intent(this, ToastyActivity.class));
                break;
            case R.id.main_view:
                startActivity(new Intent(this, ViewActivity.class));
                break;
            case R.id.main_textView:
                startActivity(new Intent(this, OwnTextViewActivity.class));
                break;
            case R.id.main_status:
                startActivity(new Intent(this, StatusBarActivity.class));
                break;
            case R.id.main_time:
                startActivity(new Intent(this, TimePickActivity.class));
                break;
            case R.id.main_coordina:
                startActivity(new Intent(this, CoordinatorLayoutActivity.class));
                break;
            case R.id.main_metrialTheme:
                startActivity(new Intent(this, MetrialThemeActivity.class));
                break;
        }
    }
}
