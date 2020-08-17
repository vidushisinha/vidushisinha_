package com.example.av.ui.home;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.LiveData;

public class HomeViewModel extends ViewModel {
     // TODO: Implement the ViewModel
     private MutableLiveData<String> mText;

    public HomeViewModel() {

        mText = new MutableLiveData<>();
        mText.setValue("©AVtook !All rights reserved.");
    }



    public LiveData<String> getText() {
        return mText;
    }
}