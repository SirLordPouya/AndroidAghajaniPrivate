package com.sematec.android.advanced.androidaghajaniprivate.mvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TestMVVMViewModel extends ViewModel {

    private MutableLiveData<String> liveData = new MutableLiveData<>();

    public void getName(int id) {
        switch (id) {
            case 1:
                liveData.setValue("Name 1");
                break;
            case 2:
                liveData.setValue("Name 2");
                break;
            case 3:
                liveData.setValue("Name 3");
                break;
            case 4:
                liveData.setValue("Name 4");
                break;
            case 5:
                liveData.setValue("Name 5");
        }
    }

    public LiveData<String> getLiveData() {
        return liveData;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
