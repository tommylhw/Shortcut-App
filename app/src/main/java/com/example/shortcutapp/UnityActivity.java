package com.example.shortcutapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class UnityActivity extends AppCompatActivity {

    Toolbar TopActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unity);

        // set up the top tool bar
        TopActionBar = (Toolbar) findViewById(R.id.tlb_top_action_bar);
        setSupportActionBar(TopActionBar);
        getSupportActionBar().setTitle("Unity Shortcut");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
