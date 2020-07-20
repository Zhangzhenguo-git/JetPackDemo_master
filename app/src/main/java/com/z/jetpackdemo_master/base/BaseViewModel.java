package com.z.jetpackdemo_master.base;

import android.app.Activity;
import android.content.Context;

import androidx.lifecycle.ViewModel;

public abstract class BaseViewModel extends ViewModel {
    public abstract void setActivity(Activity activity);
}
