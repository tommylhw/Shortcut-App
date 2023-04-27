package com.example.shortcutapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AddDataActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Toolbar TopActionBar;
    Spinner SpinnerSoftware;
    EditText EditTextTitle, EditTextDescription;
    Button ButtonSaveDataButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);

        // Set up bottomNavigationView
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bnb_bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.add_data);
        SetupBottomNavigationView();

        // set up the top tool bar
        TopActionBar = (Toolbar) findViewById(R.id.tlb_top_action_bar);
        setSupportActionBar(TopActionBar);
        getSupportActionBar().setTitle("Add Data");

        // set up input elements
        SpinnerSoftware = (Spinner) findViewById(R.id.spn_software);
        EditTextTitle = (EditText) findViewById(R.id.edt_title);
        EditTextDescription = (EditText) findViewById(R.id.edt_description);
        ButtonSaveDataButton = (Button) findViewById(R.id.btn_save_data);

        //ButtonSaveDataButton.setBackgroundColor(0x00000000);
    }

    public void SetupBottomNavigationView() {
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        return true;
                    case R.id.add_data:

                        return true;
                    case R.id.setting:
                        startActivity(new Intent(getApplicationContext(), SettingActivity.class));
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        return true;

                }

                return false;
            }
        });
    }
}
