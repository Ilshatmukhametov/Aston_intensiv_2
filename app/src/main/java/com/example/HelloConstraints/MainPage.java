package com.example.HelloConstraints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import HelloConstraints.R;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
    }

    public void firstAppNav(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void secondAppNav(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void thirdAppNav(View view) {
        Intent intent = new Intent(this, StateSave.class);
        startActivity(intent);
    }
    public void fourthAppNav(View view) {
        Intent intent = new Intent(this, ImplicitPage.class);
        startActivity(intent);
    }
}