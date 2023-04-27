package com.example.shortcutapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class WindowsActivity extends AppCompatActivity {

    Toolbar TopActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_windows);

        // set up the top tool bar
        TopActionBar = (Toolbar) findViewById(R.id.tlb_top_action_bar);
        setSupportActionBar(TopActionBar);
        getSupportActionBar().setTitle("Windows Shortcut");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
