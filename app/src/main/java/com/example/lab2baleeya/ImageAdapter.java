package com.example.lab2baleeya;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public Integer[] thumbImages = {
            R.drawable.download9, R.drawable.download10, R.drawable.download11,
            R.drawable.download12, R.drawable.download13, R.drawable.download14,
            R.drawable.download15, R.drawable.download16, R.drawable.download17,
            R.drawable.download18, R.drawable.download19, R.drawable.download20,
    };

    public ImageAdapter(Context c){ mContext = c; }

    public int getCount(){ return thumbImages.length; }

    public Object getItem(int position){ return thumbImages[position];}

    public long getItemId(int position){ return 0; }

    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(250,250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8,8,8,8);
        imageView.setImageResource(thumbImages[position]);
        return imageView;

    }
}
