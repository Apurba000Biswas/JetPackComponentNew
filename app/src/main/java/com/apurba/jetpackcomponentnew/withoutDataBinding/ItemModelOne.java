package com.apurba.jetpackcomponentnew.withoutDataBinding;

import com.apurba.jetpackcomponentnew.BaseModel;

public class ItemModelOne implements BaseModel {

    private String name;
    private String url;

    public ItemModelOne(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String getTextOne() {
        return name;
    }

    @Override
    public String getTextTwo() {
        return null;
    }

    @Override
    public String getImgUrl() {
        return url;
    }
}
