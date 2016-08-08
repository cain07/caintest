package com.cain.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.cain.test.bean.OIPackingInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn01;
    private Button btn02;
    private Button btn03;

    private List<OIPackingInfo> oiPackingInfos;

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

        initData();

    }

    private void initData() {
        oiPackingInfos = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            OIPackingInfo info = new OIPackingInfo();
            info.setPackingId(i+"");
            info.setReturnNum(100/i);
            oiPackingInfos.add(info);
        }

        Log.e("----",oiPackingInfos.toString());


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn01:
                /*intent.putExtra("weburl","file:///android_asset/sui03.html");
                intent.setClass(this,WebActivity.class);
                startActivity(intent);*/


                List<Map<String, Integer>> outerMaps = new ArrayList();

                for (OIPackingInfo info : oiPackingInfos) {
                    Map<String, Integer> outerPackageMap = new HashMap<String, Integer>();
                    outerPackageMap.put(info.getPackingId(), info.getReturnNum());
                    outerMaps.add(outerPackageMap);
                }


                Log.e("----",outerMaps.toString());

                break;
            case R.id.btn02:
                break;
            case R.id.btn03:
                break;

        }
    }
}
