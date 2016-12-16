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
            case 20: intent = new Intent(Main_Activity.this,Lesson21_SimpleActivityResult.class);
                     break;
            case 21: intent = new Intent(Main_Activity.this,Lesson22_ActivityResult.class);
                     break;
            case 22: intent = new Intent(Main_Activity.this,Lesson23_SimpleIntents.class);
                     break;
            case 23: intent = new Intent(Main_Activity.this,Lesson24_SimpleBrowser.class);
                     break;
            case 24: intent = new Intent(Main_Activity.this,Lesson25_SharedPreferences.class);
                     break;
            case 25: intent = new Intent(Main_Activity.this,Lesson26_SimpleSQLite.class);
                     break;
            case 26: intent = new Intent(Main_Activity.this,Lesson27_SQLiteQuery.class);
                     break;
            case 27: intent = new Intent(Main_Activity.this,Lesson28_SQLiteInnerJoin.class);
                     break;
            case 28: intent = new Intent(Main_Activity.this,Lesson29_SQLiteTransaction.class);
                     break;
            case 29: intent = new Intent(Main_Activity.this,Lesson30_LayoutInflater.class);
                     break;
            case 30: intent = new Intent(Main_Activity.this,Lesson31_LayoutInflaterList.class);
                     break;
            case 31: intent = new Intent(Main_Activity.this,Lesson32_SimpleList.class);
                     break;
            case 32: intent = new Intent(Main_Activity.this,Lesson33_SimpleListChoice.class);
                     break;
            case 33: intent = new Intent(Main_Activity.this,Lesson34_SimpleListEvents.class);
                     break;
            case 34: intent = new Intent(Main_Activity.this,Lesson35_ExpandableList.class);
                     break;
            case 35: intent = new Intent(Main_Activity.this,Lesson36_ExpandableListEvents.class);
                     break;
            case 36: intent = new Intent(Main_Activity.this,Lesson37_SimpleAdapter.class);
                     break;
            case 37: intent = new Intent(Main_Activity.this,Lesson38_SimpleAdapterCustom1.class);
                     break;
            case 38: intent = new Intent(Main_Activity.this,Lesson39_SimpleAdapterCustom2.class);
                     break;
            case 39: intent = new Intent(Main_Activity.this,Lesson40_SimpleAdapterData.class);
                     break;
            case 40: intent = new Intent(Main_Activity.this,Lesson41_SimpleCursorAdapter.class);
                     break;
            case 41: intent = new Intent(Main_Activity.this,Lesson42_SimpleCursorTreeAdapter.class);
                     break;
            case 42: intent = new Intent(Main_Activity.this,Lesson43_CustomAdapter.class);
                     break;
            case 43: intent = new Intent(Main_Activity.this,Lesson44_HeaderFooter.class);
                     break;
            case 44: intent = new Intent(Main_Activity.this,Lesson45_Spinner.class);
                     break;
            case 45: intent = new Intent(Main_Activity.this,Lesson46_GridView.class);
                     break;
            case 46: intent = new Intent(Main_Activity.this,Lesson47_TimePickerDialog.class);
                     break;
            case 47: intent = new Intent(Main_Activity.this,Lesson48_DatePickerDialog.class);
                     break;
            case 48: intent = new Intent(Main_Activity.this,Lesson49_AlertDialogSimple.class);
                     break;
            case 49: intent = new Intent(Main_Activity.this,Lesson50_AlertDialogPrepare.class);
                     break;
            case 50: intent = new Intent(Main_Activity.this,Lesson51_AlertDialogItems.class);
                     break;
            case 51: intent = new Intent(Main_Activity.this,Lesson52_AlertDialogItemsSingle.class);
                     break;
            case 52: intent = new Intent(Main_Activity.this,Lesson53_AlertDialogItemsMulti.class);
                     break;
            case 53: intent = new Intent(Main_Activity.this,Lesson54_AlertDialogCustom.class);
                     break;
            case 54: intent = new Intent(Main_Activity.this,Lesson55_AlertDialogOperations.class);
                     break;
            case 55: intent = new Intent(Main_Activity.this,Lesson56_ProgressDialog.class);
                     break;
            case 56: intent = new Intent(Main_Activity.this,Lesson57_Parcel.class);
                     break;
            case 57: intent = new Intent(Main_Activity.this,Lesson58_Parcelable.class);
                     break;
        }

        if(intent != null)
            startActivity(intent);
    }
}