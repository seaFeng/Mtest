package com.haige.mtest.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.haige.mtest.R;

import es.dmoral.toasty.Toasty;

public class ViewActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tv_get;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        initView();
    }

    private void initView() {
        tv_get = (TextView) findViewById(R.id.ac_view_get);
        tv_get.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.ac_view_get:
                long top = tv_get.getTop();
                long left = tv_get.getLeft();
                String topStr = String.valueOf(top);
                String leftStr = String.valueOf(left);
                Toasty.info(this,"上边距的坐标"+ topStr).show();
                Toasty.info(this,"上边距的坐标"+ topStr).show();
                break;
        }
    }
}
