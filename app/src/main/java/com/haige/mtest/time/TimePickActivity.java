package com.haige.mtest.time;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.haige.mtest.R;

import es.dmoral.toasty.Toasty;

public class TimePickActivity extends AppCompatActivity {
    private TextView tv_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_pick);
        initView();
        dateSelect();
    }

    private void initView() {
        tv_show = (TextView) findViewById(R.id.time_show);
    }

    private void dateSelect() {
        Toasty.info(this,"1111111").show();
        TimeSelector timeSelector1 = new TimeSelector(this, new TimeSelector.ResultHandler() {
            @Override
            public void handle(String time) {

            }
        }, "2000-1-31 0:0", "2020-12-31 23:59");
        timeSelector1.setIsLoop(false);
        timeSelector1.setMode(TimeSelector.MODE.YM);
        timeSelector1.show();
    }
}

