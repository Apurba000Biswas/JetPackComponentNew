package com.apurba.jetpackcomponentnew;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    //private static ItemViewHolder sInstance;

    public enum ItemType{
        ITEM_ONE, ITEM_TWO
    }


    private final ItemType type;
    private final ImageView imageView;
    private final TextView tvOne;
    private final TextView tvTwo;


    public static ItemViewHolder getInstance(@NonNull ViewGroup parent, ItemType type){

        View itemView = new View(parent.getContext());

        switch (type){
            case ITEM_ONE:
                itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_view_one, parent, false);
                break;
            case ITEM_TWO:
                itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_view_two, parent, false);
                break;
        }
        return new ItemViewHolder(itemView, type);
    }

    private ItemViewHolder(@NonNull View itemView, ItemType type) {
        super(itemView);
        this.type = type;
        this.imageView = itemView.findViewById(R.id.imageView);
        this.tvOne = itemView.findViewById(R.id.textView);
        this.tvTwo = itemView.findViewById(R.id.textView2);
    }

    public void bindView(BaseModel data){
        switch (type){
            case ITEM_ONE:
                bindTextView(tvOne ,data.getTextOne());
                bindImageView(imageView, data.getImgUrl());
                break;
            case ITEM_TWO:
                bindTextView(tvOne ,data.getTextOne());
                bindTextView(tvTwo, data.getTextTwo());
                bindImageView(imageView, data.getImgUrl());
                break;

        }
    }

    private void bindTextView(TextView textView, String text){
        textView.setText(text);
    }

    private void bindImageView(ImageView imageView, String url){
        Picasso.get().load(url).into(imageView);
    }
}
