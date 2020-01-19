package com.taweesak.myappfminterfaceviewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends androidx.lifecycle.AndroidViewModel {

    MutableLiveData<MyModel> number;


    public MyViewModel(@NonNull Application application) {
        super(application);
        number = new MutableLiveData<MyModel>();
    }

    public MutableLiveData<MyModel> getNumber() {
        return number;
    }

    public void setNumber(MyModel item) {
        number.setValue(item);
    }
}
