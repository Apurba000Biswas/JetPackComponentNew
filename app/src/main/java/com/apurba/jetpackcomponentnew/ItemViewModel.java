package com.apurba.jetpackcomponentnew;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class ItemViewModel extends AndroidViewModel {

    int page;
    private MutableLiveData<List<ItemModelOne>> liveData;
    private List<ItemModelOne> dataSet;

    public ItemViewModel(@NonNull Application application) {
        super(application);
        this.liveData = new MutableLiveData<>();
        page = 1;
    }


    public void setPage(int page){
        if (page < 1) throw new IllegalArgumentException("Page Number Can not be less than 1");
        this.page = page;
    }

    public void setDataSet(List<ItemModelOne> dataSet){
        if (page == 1){
            this.dataSet = dataSet;
        }else{
            this.dataSet.addAll(dataSet);
        }
    }





}
