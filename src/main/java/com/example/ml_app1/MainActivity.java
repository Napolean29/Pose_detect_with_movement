package com.example.ml_app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import com.example.ml_app1.helpers.ImageHelperActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onGotoimageactivity(View view) {
        // start the image helper activity
        Intent intent = new Intent(this, ImageHelperActivity.class);
        startActivity(intent);


    }
}