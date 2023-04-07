package com.example.projectaad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Intent sp=new Intent(this,LoginActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            startActivity(sp);
            finish();
            }
        },3000);
    }
}