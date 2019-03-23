package com.example.nfatma.novapp;

import android.app.ListActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainMenuActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

        String[] li = {"Basic Coding", "Navigation", "Checkbox Buttons", "Radio Buttons", "toggle Buttons", "Splash Screen", "camera intent",
                "Spinner","UserPrompt", "Actionbar", "ListActivity", "AudioPlayer", "VideoPlayer", "SharedPreference","studReg","FileDemo",
                "Database", "DatabaseUsingHandler","RecyclerView", "ApiCalling", "Fragment Demo", "another fragment", "CameraGallery",
                "FireBaseDemo", "EditAndDisplayText", "Exit"};
        Class[] cl = {MainActivity.class, NavDemo.class, CheckBoxActivity.class, RadioButtonActivity.class,
                ToggleButtonActivity.class, SplashScreenActivity.class, CameraActivity.class, SpinnerActivity.class,
                UserPromptActivity.class, MenuActivity.class, ListViewModelClassDemo.class, AudioActivity.class,
                VideoPlayer.class, SharedPreferance.class, RegForm.class, FileDemo.class, CurdActivity.class,
                DatabaseUsingHandler.class, RecyclerViewDemo.class, ApiCalling.class, FragmentDemo.class,
                FragmentMain.class, CameraAndGallery.class, fireBaseDemo.class, ShowAndEditText.class};
        private ListView lt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        lt = findViewById(R.id.mainMenuList);
        ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_list_item_1, li);

        lt.setAdapter(ad);

        lt.setOnItemClickListener(this);
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position == 25){
            finishAffinity();
        }
        else{
            Intent i = new Intent(MainMenuActivity.this, cl[position]);
            startActivity(i);
        }
    }
}
