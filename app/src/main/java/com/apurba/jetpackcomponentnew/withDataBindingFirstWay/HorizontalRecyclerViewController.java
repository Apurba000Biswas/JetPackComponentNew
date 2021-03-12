package com.apurba.jetpackcomponentnew.withDataBindingFirstWay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.apurba.jetpackcomponentnew.R;

import java.util.List;

public class HorizontalRecyclerViewController{

    public static HorizontalMotherHolder getViewHolder(ViewGroup parent, int itemLayoutId){
        View horizontalView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_horizontal, parent, false);
        return new HorizontalMotherHolder(horizontalView, itemLayoutId);
    }

    public static class HorizontalMotherHolder extends RecyclerView.ViewHolder{
        private final int layoutId;
        public HorizontalMotherHolder(@NonNull View itemView, int layoutId) {
            super(itemView);
            this.layoutId = layoutId;
        }

        public void bindView(List<Object> innerDataSet){
            RecyclerView recyclerView = itemView.findViewById(R.id.rv_list_horizontal);
            LinearLayoutManager layoutManager
                    = new LinearLayoutManager(itemView.getContext()
                    , LinearLayoutManager.HORIZONTAL
                    , false);
            recyclerView.setLayoutManager(layoutManager);
            HorizontalItemAdapter adapter = new HorizontalItemAdapter(innerDataSet, layoutId);
            recyclerView.setAdapter(adapter);
        }
    }
}
