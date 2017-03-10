package com.haige.mtest.MaterialDesign;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.haige.mtest.R;

import es.dmoral.toasty.Toasty;

public class CoordinatorLayoutActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fabqqqqqqq);
        fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fabqqqqqqq:
                Snackbar.make(v,"asdafdsfa",Snackbar.LENGTH_LONG).setAction("取消", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toasty.info(CoordinatorLayoutActivity.this,"取消显示").show();
                    }
                }).show();
               /* Snackbar.make(v,"FAB", Snackbar.LENGTH_LONG)
                        .setAction("cancel", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                FloatingActionButton fab = (FloatingActionButton) v;
                                //fab.
                            }
                        })
                        .show();*/
                break;

        }
    }
}
