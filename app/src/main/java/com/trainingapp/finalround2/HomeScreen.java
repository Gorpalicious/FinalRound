package com.trainingapp.finalround2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void goToSettings(View view) {
        Intent i = new Intent(HomeScreen.this, SettingsScreen.class);
        startActivity(i);
    }

}
