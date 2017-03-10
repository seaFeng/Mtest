package com.haige.mtest.MaterialDesign;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.haige.mtest.R;

public class MetrialThemeActivity extends Activity {
    RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private String[] dates;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metrial_theme);
        initDate();
        initView();
    }

    private void initDate() {
        dates = new String[] {"条目一","条目二","条目三","条目四","条目五"};

    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.metrial_RecyclerView);
        // recyclerView的个数固定
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new MyAdapter(dates);
        recyclerView.setAdapter(adapter);
    }

    public void click1(View v) {
        switch (v.getId()) {

        }
    }
}
