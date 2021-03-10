package com.apurba.jetpackcomponentnew;

import android.os.Handler;

import androidx.lifecycle.MutableLiveData;

import com.apurba.jetpackcomponentnew.withoutDataBinding.ItemModelOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VirtualRestAPi {

    private static VirtualRestAPi api;
    private static Object lock;

    public VirtualRestAPi getInstance(){
        if (api == null){
            api = new VirtualRestAPi();
        }

        return api;
    }


    public void requestData(MutableLiveData<DataResource<List<ItemModelOne>>> liveData){
        int secondsDelayed = 2;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                DataResource<List<ItemModelOne>> dataResource = new DataResource<>();
                dataResource.setSuccessState(getDataSet());
                liveData.postValue(dataResource);
            }
        }, secondsDelayed * 1000);
    }



    private List<ItemModelOne> getDataSet(){
        List<ItemModelOne> dataSet = new ArrayList<>();

        Random rand = new Random();

        for (int i=0; i<100; i++){
            String name = " Name No : " + i;

            String url = "https://picjumbo.com/wp-content/uploads/woman-in-shopping-mall-1080x720.jpg";

            int randInt = rand.nextInt(4);
            switch (randInt){
                case 0:
                    url = "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__340.jpg";
                    break;
                case 1:
                    url = "https://i.pinimg.com/originals/45/74/c6/4574c68d814dc0d3a64611ee401ea7dc.jpg";
                    break;
                case 2:
                    url = "https://images.unsplash.com/photo-1541348263662-e068662d82af?ixid=MXwxMjA3fDB8MHxzZWFyY2h8M3x8c3BvcnRzJTIwY2FyfGVufDB8fDB8&ixlib=rb-1.2.1&w=1000&q=80";
                    break;
                case 3:
                    url = "https://i.redd.it/iguyejdwmxw51.jpg";
                    break;
                case 4:
                    url = "https://wallpaperboat.com/wp-content/uploads/2019/08/Abstract-Pictures-On-The-Car.jpg";
                    break;
            }

            dataSet.add(new ItemModelOne(name, url));
        }

        return dataSet;
    }

}
