package com.haige.mtest.MaterialDesign;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.haige.mtest.R;

/**
 * Created by Administrator on 2017/3/10 0010.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private String[] dates;

    public MyAdapter(String[] dates) {
        this.dates = dates;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView v = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_text,parent,false);
        // 设置View的 size margin，padding，and layout parameters
        //.....
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv_item.setText(dates[position]);
    }

    @Override
    public int getItemCount() {
        return dates.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_item;
        public ViewHolder(TextView itemView) {
            super(itemView);
            tv_item = itemView;
        }
    }
}
