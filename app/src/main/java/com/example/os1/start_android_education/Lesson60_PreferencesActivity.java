package com.example.os1.start_android_education;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by OS1 on 17.12.2016.
 */
public class Lesson60_PreferencesActivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.layout.preferences_lesson60);
    }
}
