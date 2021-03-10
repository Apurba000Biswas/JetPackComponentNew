package com.apurba.jetpackcomponentnew.withoutDataBinding;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends   RecyclerView.Adapter < RecyclerView.ViewHolder > {

    private final List<ItemModelOne> itemModelOneList;
    private final List<ItemModelTwo> itemModelTwoList;


    public ListAdapter(){
        itemModelOneList = new ArrayList<>();
        itemModelTwoList = new ArrayList<>();

        for (int i=0; i<30; i++){
            itemModelOneList.add(new ItemModelOne("JetPack & Generics " + i, "https://static.bangkokpost.com/media/content/20191109/c1_1790799.jpg"));
        }

        for (int i=0; i<30; i++){
            itemModelTwoList.add(new ItemModelTwo("JetPack & Generics " + i, "By Apurba Biswas",
                    "https://www.lep.co.uk/images-a.jpimedia.uk/imagefetch/http://www.lep.co.uk/webimage/Prestige.Item.1.108845750!image/image.jpg"));
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 2 == 0) return 1;
        return 2;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return (viewType == 1) ? ItemViewHolder.getInstance(parent, ItemViewHolder.ItemType.ITEM_ONE)
                : ItemViewHolder.getInstance(parent, ItemViewHolder.ItemType.ITEM_TWO);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ItemViewHolder viewHolder = (ItemViewHolder) holder;
        if (position == 0) viewHolder.bindView(itemModelOneList.get(position));
        if (position == 1) viewHolder.bindView(itemModelTwoList.get(position));

        if (position > 1){
            if (position % 2 == 0){
                viewHolder.bindView(itemModelOneList.get(position/2));
            }else{
                viewHolder.bindView(itemModelTwoList.get(position/2));
            }
        }
    }

    @Override
    public int getItemCount() {
        return itemModelOneList.size() + itemModelTwoList.size();
    }
}
