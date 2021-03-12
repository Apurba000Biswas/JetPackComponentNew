package com.apurba.jetpackcomponentnew.withDataBindingFirstWay;

import com.apurba.jetpackcomponentnew.R;

import java.util.List;

public class HorizontalItemAdapter extends BaseAdapter{

    private List<Object> dataSet;
    private int layoutId;

    public HorizontalItemAdapter(List<Object> dataSet, int layoutId){
        this.dataSet = dataSet;
        this.layoutId = layoutId;
    }

    @Override
    public Object getDataAtPosition(int position) {
        return dataSet.get(position);
    }

    @Override
    public int getLayoutIdForType(int viewType) {
        return layoutId;
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

}
