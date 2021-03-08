package com.apurba.jetpackcomponentnew;

public class ItemModelTwo implements BaseModel{

    private String textOne;
    private String textTwo;
    private String url;

    public ItemModelTwo(String textOne, String textTwo, String imgUrl) {
        this.textOne = textOne;
        this.textTwo = textTwo;
        this.url = imgUrl;
    }

    @Override
    public String getTextOne() {
        return textOne;
    }

    @Override
    public String getTextTwo(){
        return textTwo;
    }

    @Override
    public String getImgUrl() {
        return url;
    }

}
