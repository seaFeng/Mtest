package com.haige.mtest.textview;

import android.graphics.Paint;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.haige.mtest.R;
import com.haige.mtest.utils.ViewUtils;

import es.dmoral.toasty.Toasty;

public class OwnTextViewActivity extends AppCompatActivity {
    private TextView tv_zong;
    private TextView tv_xia;
    private LinearLayout ll_temp;
    private static final String TAG = "自定义view的测试：";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_own_text_view);
        initView();
    }

    private void initView() {
        tv_zong = (TextView) findViewById(R.id.text_zong);
        tv_zong.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);
        tv_xia = (TextView) findViewById(R.id.text_xia);
        tv_xia.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        TextView tv_own = new TextView(this);
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        LayoutInflater inflater1 = getLayoutInflater();
        LinearLayout view1 = (LinearLayout) inflater.inflate(R.layout.own_layout,null);
        View rootView1 = tv_zong.getRootView();
        View rootView2 = View.inflate(this,R.layout.activity_own_text_view,null);
        ll_temp= (LinearLayout) findViewById(R.id.text_linea);
        /*if (rootView1 == rootView2) {
            Toasty.info(this,"相等").show();
        } else {
            Toasty.error(this,"不相等").show();
        }*/
        Log.e(TAG,ll_temp.getParent().toString());
        Log.e(TAG,ll_temp.getRootView().toString());
        ViewUtils.setWindowStatusBarColor(this,R.color.ff8844);
    }
}
