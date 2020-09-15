package com.afa.infinite_scrollview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;


import java.util.List;

public class Adapter extends PagerAdapter {
    Context context;
    List<Integer> pic;
    LayoutInflater layoutInflater;

    public Adapter(List<Integer> pic, Context context) {
        this.context = context;
        this.pic = pic;
        this.layoutInflater = layoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return pic.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = layoutInflater.from(context).inflate(R.layout.card_layout, container, false);
        ImageView image = view.findViewById(R.id.adpter_image);
        image.setImageResource(pic.get(position));
        container.addView(view);
        return view;
    }
}
