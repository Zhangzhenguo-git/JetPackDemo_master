package com.z.jetpackdemo_master;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.z.jetpackdemo_master.databinding.ActivityMainBinding;
import com.z.jetpackdemo_master.lifecyle.LifeActivity;
import com.z.jetpackdemo_master.livedatademo.LiveDataActivity;
import com.z.jetpackdemo_master.navdemo.NavigationActivity;
import com.z.jetpackdemo_master.paging.PagingActivity;
import com.z.jetpackdemo_master.room.RoomActivity;
import com.z.jetpackdemo_master.viewmodeldemo.TestViewModelActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        myCLick();
    }

    private void myCLick() {
        binding.btViewModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TestViewModelActivity.class));
            }
        });
        binding.btLiveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LiveDataActivity.class));
            }
        });
        binding.btNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NavigationActivity.class));
            }
        });
        binding.btRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RoomActivity.class));
            }
        });
        binding.btLifecy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LifeActivity.class));
            }
        });
        binding.btPaging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PagingActivity.class));
            }
        });
    }
}