package com.z.jetpackdemo_master.viewmodeldemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.z.jetpackdemo_master.R;
import com.z.jetpackdemo_master.databinding.ActivityTestviewmodelBinding;
import com.z.jetpackdemo_master.viewmodeldemo.viewmodel.TestViewModel;

public class TestViewModelActivity extends AppCompatActivity {

    private TestViewModel testViewModel;
    private ActivityTestviewmodelBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_testviewmodel);
        testViewModel=new ViewModelProvider(this).get(TestViewModel.class);
        myClick();
    }
    private void myClick(){
        binding.textView3.setText(String.valueOf(testViewModel.getTicketPlus()));
        binding.textView4.setText(String.valueOf(testViewModel.getTicketReduce()));
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testViewModel.setTicketPlus(testViewModel.getTicketPlus()+1);
                binding.textView3.setText(String.valueOf(testViewModel.getTicketPlus()));
            }
        });
        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testViewModel.setTicketReduce(testViewModel.getTicketReduce()-1);
                binding.textView4.setText(String.valueOf(testViewModel.getTicketReduce()));
            }
        });
    }
}