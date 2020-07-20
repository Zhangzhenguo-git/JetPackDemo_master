package com.z.jetpackdemo_master.lifecyle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.z.jetpackdemo_master.R;
import com.z.jetpackdemo_master.view.ChronometerTimer;

public class LifeActivity extends AppCompatActivity {

    private ChronometerTimer cmTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);
        cmTimer=findViewById(R.id.cmTimer);
        getLifecycle().addObserver(cmTimer);
    }
}