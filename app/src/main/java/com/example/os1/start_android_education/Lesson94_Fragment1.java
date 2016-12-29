package com.example.os1.start_android_education;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by OS1 on 29.12.2016.
 */

public class Lesson94_Fragment1 extends Fragment {

    private final String LOG_TAG = "myLogs";

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // return inflater.inflate(R.layout.fragment1_lesson94, null);

        View v = inflater.inflate(R.layout.fragment1_lesson94, null);

        Button button = (Button) v.findViewById(R.id.Lesson94_Fragment1_Btn);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Log.d(LOG_TAG, "Button click in Fragment1");
                ((Button) getActivity().findViewById(R.id.Lesson94_Find_Btn)).setText("Access from Fragment1");
            }
        });

        return v;
    }
}
