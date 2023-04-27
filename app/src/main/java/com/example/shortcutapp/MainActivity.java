package com.example.shortcutapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    Toolbar TopActionBar;
    ImageButton ButtonWindow, ButtonUnity, ButtonVisualStudio, ButtonAndroidStudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set up the top tool bar
        TopActionBar = (Toolbar) findViewById(R.id.tlb_top_action_bar);
        setSupportActionBar(TopActionBar);

        // Set up bottomNavigationView
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bnb_bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.home);
        SetupBottomNavigationView();

        // Set up UI Elements
        ButtonWindow = (ImageButton) findViewById(R.id.btn_windows);
        ButtonUnity = (ImageButton) findViewById(R.id.btn_unity);
        ButtonVisualStudio = (ImageButton) findViewById(R.id.btn_visual_studio);
        ButtonAndroidStudio = (ImageButton) findViewById(R.id.btn_android_studio);

        OnButtonClicked();

    }

    public void OnButtonClicked() {
        // Windows Button clicked event
        ButtonWindow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), WindowsActivity.class));
            }
        });

        // Unity Button clicked event
        ButtonUnity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), UnityActivity.class));
            }
        });

        // VS Button clicked event
        ButtonVisualStudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), VisualStudioActivity.class));
            }
        });

        // Android Studio Button clicked event
        ButtonAndroidStudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AndroidStudioActivity.class));
            }
        });

    }

    public void SetupBottomNavigationView() {
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:

                        return true;
                    case R.id.add_data:
                        startActivity(new Intent(getApplicationContext(), AddDataActivity.class));
                        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
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
