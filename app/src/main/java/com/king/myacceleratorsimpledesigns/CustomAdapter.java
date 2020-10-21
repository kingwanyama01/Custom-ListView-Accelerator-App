package com.king.myacceleratorsimpledesigns;

//CustomAdapter
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {
    Context mContext;
    ArrayList<Item> data;//modify here

    public CustomAdapter(Context mContext, ArrayList<Item> data) {
        this.mContext = mContext;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();// # of items in your arraylist
    }
    @Override
    public Object getItem(int position) {
        return data.get(position);// get the actual item
    }
    @Override
    public long getItemId(int id) {
        return id;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(R.layout.item_layout, parent,false);//modify here
            viewHolder = new ViewHolder();
            //modify this block of code
            viewHolder.mTvName = convertView.findViewById(R.id.tv_name);
            viewHolder.mTvPhone = convertView.findViewById(R.id.tv_phone);
            viewHolder.mImgPhoto = convertView.findViewById(R.id.img_poster);
            //Up to here
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        //MODIFY THIS BLOCK OF CODE
        Item person = data.get(position);//modify here
        viewHolder.mTvName.setText(person.getName());//modify here
        viewHolder.mTvPhone.setText(person.getPhone());//modify here
        viewHolder.mImgPhoto.setImageResource(person.getPhoto());
        return convertView;

    }
    static class ViewHolder {
        TextView mTvName;
        TextView mTvPhone;
        ImageView mImgPhoto;
    }

}