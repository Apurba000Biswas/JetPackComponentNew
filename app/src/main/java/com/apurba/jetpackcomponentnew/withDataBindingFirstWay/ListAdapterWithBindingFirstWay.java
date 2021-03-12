package com.apurba.jetpackcomponentnew.withDataBindingFirstWay;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apurba.jetpackcomponentnew.R;

import java.util.List;

public class ListAdapterWithBindingFirstWay extends BaseAdapter{

    private static final int ITEM_NAME_IMAGE_VIEW_TYPE = 0;
    private static final int ITEM_NAME_IMAGE_DESC_VIEW_TYPE = 1;
    private static final int ITEM_NAME_IMAGE_IMAGE_VIEW_TYPE = 2;
    private static final int LIST_ITEM_NAME_IMAGE_VIEW_TYPE = 3;

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
        }else if (data instanceof List){
            return LIST_ITEM_NAME_IMAGE_VIEW_TYPE;
        } else{
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

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == LIST_ITEM_NAME_IMAGE_VIEW_TYPE){
           return HorizontalRecyclerViewController.getViewHolder(parent
                   , R.layout.item_name_image_horizontal);
        }


        return super.onCreateViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int viewType = getItemViewType(position);
        if (viewType == LIST_ITEM_NAME_IMAGE_VIEW_TYPE){
            HorizontalRecyclerViewController.HorizontalMotherHolder viewHolder =
                    (HorizontalRecyclerViewController.HorizontalMotherHolder) holder;
            viewHolder.bindView((List<Object>) dataSet.get(position));
            return;
        }
        super.onBindViewHolder(holder, position);
    }

    @Override
    public int getItemCount() {
        return (dataSet == null) ? 0 : dataSet.size();
    }

}
