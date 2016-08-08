package com.cain.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn01;
    private Button btn02;
    private Button btn03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn01 = (Button) findViewById(R.id.btn01);

        btn02 = (Button) findViewById(R.id.btn02);
        btn03 = (Button) findViewById(R.id.btn03);
        btn01.setOnClickListener(this);
        btn02.setOnClickListener(this);
        btn03.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn01:
                /*intent.putExtra("weburl","file:///android_asset/sui03.html");
                intent.setClass(this,WebActivity.class);
                startActivity(intent);*/

                
                break;
            case R.id.btn02:
                break;
            case R.id.btn03:
                break;

        }
    }
}
