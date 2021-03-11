package com.apurba.jetpackcomponentnew.withDataBindingFirstWay;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.apurba.jetpackcomponentnew.BR;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    public abstract Object getDataAtPosition(int position);
    public abstract int getLayoutIdForType(int viewType);

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, getLayoutIdForType(viewType)
                , parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((BaseViewHolder)holder).bindView(getDataAtPosition(position));
    }

    private class BaseViewHolder extends RecyclerView.ViewHolder{

        private ViewDataBinding binding;
        public BaseViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bindView(Object object){
            binding.setVariable(BR.item, object);
            binding.executePendingBindings();
        }
    }

}
