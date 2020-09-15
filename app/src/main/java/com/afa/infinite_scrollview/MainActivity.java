package com.afa.infinite_scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Integer> pic = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniData();
        HorizontalInfiniteCycleViewPager pager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.view_page);
        Adapter adapter = new Adapter(pic,getBaseContext());
        pager.setAdapter(adapter);


    }
    private void iniData(){
        pic.add(R.drawable.joker);
        pic.add(R.drawable.lion);
        pic.add(R.drawable.elephant);
        pic.add(R.drawable.cat);
        pic.add(R.drawable.monkey);
    }
}