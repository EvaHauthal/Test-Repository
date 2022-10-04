package com.example.gitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//Sagnik's comment on line 7
//Sagnik's comment on line 8

public class MainActivity extends AppCompatActivity {

 //this is our important change
    //this is Eva's commit
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}