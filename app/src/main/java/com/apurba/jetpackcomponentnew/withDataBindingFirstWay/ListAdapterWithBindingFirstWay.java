package com.apurba.jetpackcomponentnew.withDataBindingFirstWay;

import com.apurba.jetpackcomponentnew.R;

import java.util.List;

public class ListAdapterWithBindingFirstWay extends BaseAdapter{

    private static final int ITEM_NAME_IMAGE_VIEW_TYPE = 0;
    private static final int ITEM_NAME_IMAGE_DESC_VIEW_TYPE = 1;
    private static final int ITEM_NAME_IMAGE_IMAGE_VIEW_TYPE = 2;

    private List<Object> dataSet;

    public ListAdapterWithBindingFirstWay(List<Object> dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public int getItemViewType(int position) {
        Object data = dataSet.get(position);
        if (data instanceof ItemNameImage){
            return ITEM_NAME_IMAGE_VIEW_TYPE;
        }else if (data instanceof ItemNameImgDesc){
            return ITEM_NAME_IMAGE_DESC_VIEW_TYPE;
        }else{
            return ITEM_NAME_IMAGE_IMAGE_VIEW_TYPE;
        }
    }

    @Override
    public Object getDataAtPosition(int position) {
        return dataSet.get(position);
    }

    @Override
    public int getLayoutIdForType(int viewType) {
        switch (viewType){
            case ITEM_NAME_IMAGE_VIEW_TYPE:
                return R.layout.item_name_image;
            case ITEM_NAME_IMAGE_DESC_VIEW_TYPE:
                return R.layout.item_name_image_description;
            case ITEM_NAME_IMAGE_IMAGE_VIEW_TYPE:
                return R.layout.item_name_image_image;
        }
        return -10;
    }

    @Override
    public int getItemCount() {
        return (dataSet == null) ? 0 : dataSet.size();
    }
}
