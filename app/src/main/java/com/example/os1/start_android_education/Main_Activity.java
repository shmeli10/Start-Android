package com.example.os1.start_android_education;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by OS1 on 19.11.2016.
 */
public class Main_Activity extends Activity {

    private ListView coursesLV;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.examples, android.R.layout.simple_list_item_1);

        coursesLV = (ListView) findViewById(R.id.Main_Activity_LV);
        coursesLV.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        coursesLV.setAdapter(adapter);

        coursesLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                moveForward(position);
            }
        });
    }

    private void moveForward(int position) {

        switch(position) {

            case 0: intent = new Intent(Main_Activity.this,Lesson1_BasicViews.class);
                    break;
            case 1: intent = new Intent(Main_Activity.this,Lesson2_ScreenOrientation.class);
                    break;
            case 2: intent = new Intent(Main_Activity.this,Lesson3_Layouts.class);
                    break;
            case 3: intent = new Intent(Main_Activity.this,Lesson4_LayoutProperties.class);
                    break;
            case 4: intent = new Intent(Main_Activity.this,Lesson5_ViewById.class);
                    break;
            case 5: intent = new Intent(Main_Activity.this,Lesson6_OnClickButtons.class);
                    break;
            case 6: intent = new Intent(Main_Activity.this,Lesson7_ResValuesFolder.class);
                    break;
            case 7: intent = new Intent(Main_Activity.this,Lesson8_SimpleMenu.class);
                    break;
            case 8: intent = new Intent(Main_Activity.this,Lesson9_AdvancedMenu.class);
                    break;
            case 9: intent = new Intent(Main_Activity.this,Lesson10_ContextMenu.class);
                    break;
            case 10: intent = new Intent(Main_Activity.this,Lesson11_DynamicLayout.class);
                     break;
            case 11: intent = new Intent(Main_Activity.this,Lesson12_DynamicLayout2.class);
                     break;
            case 12: intent = new Intent(Main_Activity.this,Lesson13_DynamicLayout3.class);
                     break;
            case 13: intent = new Intent(Main_Activity.this,Lesson14_SimpleCalculator.class);
                     break;
            case 14: intent = new Intent(Main_Activity.this,Lesson15_SimpleAnimation.class);
                     break;
            case 15: intent = new Intent(Main_Activity.this,Lesson16_TwoActivities.class);
                     break;
            case 16: intent = new Intent(Main_Activity.this,Lesson17_ActivityStates.class);
                     break;
            case 17: intent = new Intent(Main_Activity.this,Lesson18_TwoActivityStates.class);
                     break;
            case 18: intent = new Intent(Main_Activity.this,Lesson19_IntentFilter.class);
                     break;
            case 19: intent = new Intent(Main_Activity.this,Lesson20_IntentExtras.class);
                     break;
        }

        if(intent != null)
            startActivity(intent);
    }
}