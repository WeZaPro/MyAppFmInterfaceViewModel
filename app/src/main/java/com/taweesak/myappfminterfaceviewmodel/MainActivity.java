package com.taweesak.myappfminterfaceviewmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentA fragmentA = new FragmentA();
        if(savedInstanceState == null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.contentContainer,fragmentA)
                    .commit();
        }

    }
}
