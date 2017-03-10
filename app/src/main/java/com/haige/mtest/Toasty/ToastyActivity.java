package com.haige.mtest.Toasty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.haige.mtest.R;

import es.dmoral.toasty.Toasty;

public class ToastyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toasty);
    }

    public void click(View view) {
        switch (view.getId()){
            case R.id.ac_toasty_error:
                Toasty.error(this,"this is a error toast.", Toast.LENGTH_SHORT,true).show();
                break;
        }
    }
}
