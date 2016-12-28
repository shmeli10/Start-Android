package com.example.os1.start_android_education;

import android.app.Activity;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

/**
 * Created by OS1 on 27.12.2016.
 */
public class Lesson90_Touch extends     Activity
                            implements  View.OnClickListener,
                                        View.OnTouchListener {

    private LinearLayout arrowBackWrapLL;

    private final String LOG_TAG = "myLogs";

    private TextView mTV;

    private float x;
    private float y;

    private String mDown;
    private String mMove;
    private String mUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson90);

        arrowBackWrapLL = (LinearLayout) findViewById(R.id.Lesson90_ArrowBackWrapLL);
        arrowBackWrapLL.setOnClickListener(this);

        /////////////////////////////////////////////////////////////////////////////////

        mTV = (TextView) findViewById(R.id.Lesson90_TV);
        mTV.setOnTouchListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.Lesson90_ArrowBackWrapLL:
                startActivity(new Intent(Lesson90_Touch.this, Main_Activity.class));
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        x = motionEvent.getX();
        y = motionEvent.getY();

        switch(motionEvent.getAction()) {

            case MotionEvent.ACTION_DOWN:       // нажатие
                mDown = "Down: " +x+ "," +y;
                mMove = "";
                mUp = "";
                break;
            case MotionEvent.ACTION_MOVE:       // движение
                mMove = "Move: " + x + "," + y;
                break;
            case MotionEvent.ACTION_UP:         // отпускание
            case MotionEvent.ACTION_CANCEL:
                mMove = "";
                mUp = "Up: " + x + "," + y;
                break;
        }

        mTV.setText(mDown + "\n" + mMove + "\n" + mUp);

        return true;
    }
}