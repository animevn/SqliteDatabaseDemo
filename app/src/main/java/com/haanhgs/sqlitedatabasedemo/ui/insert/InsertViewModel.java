package com.haanhgs.sqlitedatabasedemo.ui.insert;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InsertViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InsertViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}