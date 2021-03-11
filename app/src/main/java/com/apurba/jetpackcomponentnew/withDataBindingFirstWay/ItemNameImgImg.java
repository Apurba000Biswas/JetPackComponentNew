package com.apurba.jetpackcomponentnew.withDataBindingFirstWay;

import java.util.Observable;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class ItemNameImgImg extends BaseObservable {
    private String name;
    private String imageOne;
    private String imageTwo;


    public ItemNameImgImg(String name, String imageOne, String imageTwo) {
        this.name = name;
        this.imageOne = imageOne;
        this.imageTwo = imageTwo;
    }

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public String getImageOne() {
        return imageOne;
    }

    @Bindable
    public String getImageTwo() {
        return imageTwo;
    }
}
