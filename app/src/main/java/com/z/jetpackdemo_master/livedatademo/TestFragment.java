package com.z.jetpackdemo_master.livedatademo;

import androidx.databinding.DataBinderMapper;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.z.jetpackdemo_master.R;
import com.z.jetpackdemo_master.databinding.TestFragmentBinding;
import com.z.jetpackdemo_master.livedatademo.viewmodel.TestViewModel;

public class TestFragment extends Fragment {

    private TestViewModel mViewModel;
    private TestFragmentBinding binding;

    public static TestFragment newInstance() {
        return new TestFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding= TestFragmentBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(TestViewModel.class);
        mViewModel.setActivity(getActivity());
        // TODO: Use the ViewModel
    }

}