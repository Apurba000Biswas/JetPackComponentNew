package com.apurba.jetpackcomponentnew.withDataBindingFirstWay;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class ItemNameImgDesc extends BaseObservable {
    private String name;
    private String image;
    private String description;

    public ItemNameImgDesc(String name, String image, String description) {
        this.name = name;
        this.image = image;
        this.description = description;
    }

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public String getImage() {
        return image;
    }

    @Bindable
    public String getDescription() {
        return description;
    }
}
