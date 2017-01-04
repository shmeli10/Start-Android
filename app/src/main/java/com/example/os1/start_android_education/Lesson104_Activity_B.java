package com.example.os1.start_android_education;

import android.content.Intent;
import android.view.View;

/**
 * Created by sostrovschi on 1/4/17.
 */

public class Lesson104_Activity_B extends Lesson104_MngTasks1 {

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, Lesson104_Activity_C.class));
    }
}
