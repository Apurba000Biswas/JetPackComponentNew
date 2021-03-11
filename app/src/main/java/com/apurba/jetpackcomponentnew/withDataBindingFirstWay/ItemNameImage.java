package com.apurba.jetpackcomponentnew.withDataBindingFirstWay;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class ItemNameImage extends BaseObservable {

    private String name;
    private String image;

    public ItemNameImage(String name, String image) {
        this.name = name;
        this.image = image;
    }


    @Bindable
    public String getName(){
        return name;
    }

    @Bindable
    public String getImage(){
        return image;
    }

    public void setName(String name) {
        this.name = name;
        //notifyPropertyChanged(BR.name);
    }

    public void setImage(String image) {
        this.image = image;
        //notifyPropertyChanged(BR.image);
    }

}
