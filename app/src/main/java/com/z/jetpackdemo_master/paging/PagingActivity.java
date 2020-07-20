package com.z.jetpackdemo_master.paging;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.z.jetpackdemo_master.R;
import com.z.jetpackdemo_master.databinding.ActivityPagingBinding;
import com.z.jetpackdemo_master.room.database.WorksEntity;
import com.z.jetpackdemo_master.room.database.WorksRepository;

import java.util.List;

public class PagingActivity extends AppCompatActivity {

    private ActivityPagingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paging);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_paging);

        PagingAdapter adapter=new PagingAdapter();
        binding.pagingRecycleView.setAdapter(adapter);
        binding.pagingRecycleView.setLayoutManager(new LinearLayoutManager(this));
        LiveData<PagedList<WorksEntity>> datas = new LivePagedListBuilder<>(WorksRepository.getInstance(this).getWorksDao().getWorksForPaging(),15).build();
        datas.observe(this, new Observer<PagedList<WorksEntity>>() {
            @Override
            public void onChanged(PagedList<WorksEntity> worksEntities) {
                adapter.submitList(worksEntities);
            }
        });
    }
}