package com.example.shortcutapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SettingActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Toolbar TopActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        // Set up bottomNavigationView
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bnb_bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.setting);
        SetupBottomNavigationView();

        // set up the top tool bar
        TopActionBar = (Toolbar) findViewById(R.id.tlb_top_action_bar);
        setSupportActionBar(TopActionBar);
        getSupportActionBar().setTitle("Setting");
    }

    public void SetupBottomNavigationView() {
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                        return true;
                    case R.id.add_data:
                        startActivity(new Intent(getApplicationContext(), AddDataActivity.class));
                        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                        return true;
                    case R.id.setting:

                        return true;

                }

                return false;
            }
        });
    }
}
