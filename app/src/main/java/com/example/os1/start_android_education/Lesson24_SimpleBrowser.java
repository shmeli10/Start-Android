package com.example.os1.start_android_education;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by OS1 on 06.12.2016.
 */
public class Lesson24_SimpleBrowser extends     Activity
                                    implements  View.OnClickListener {

    private LinearLayout arrowBackWrapLL;

    private Button mWebBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson24);

        arrowBackWrapLL = (LinearLayout) findViewById(R.id.Lesson24_ArrowBackWrapLL);
        arrowBackWrapLL.setOnClickListener(this);

        mWebBTN = (Button) findViewById(R.id.Lesson24_Web_BTN);
        mWebBTN.setOnClickListener(this);

//        findViewById(R.id.btnWeb)).setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ya.ru")));
//            }
//        });
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.Lesson24_ArrowBackWrapLL:
                                                startActivity(new Intent(Lesson24_SimpleBrowser.this, Main_Activity.class));
                                                break;

            case R.id.Lesson24_Web_BTN:         startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
                                                break;

        }
    }
}