package com.example.mymusicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;

import com.example.mymusicplayer.databinding.ItemBinding;

import java.util.ArrayList;


public class BoxAdapter extends BaseAdapter{

    Context ctx;

    ImageButton check;

    LayoutInflater lInflater;
    ArrayList<MusicProducts> objects;



    BoxAdapter(Context context, ArrayList<MusicProducts> products) {
        ctx = context;
        objects = products;
        lInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return objects.size();
    }


    public Object getItem(int i) {
        return objects.get(i);
    }


    public long getItemId(int i) {
        return i;
    }



    public View getView(int i, View convertview, ViewGroup parent) {

        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        MusicProducts p = getProduct(i);

        binding.ivImage.setImageResource(p.img);
        binding.mtext.setText(p.mustext);


        check = binding.butcheck;


        check.setOnClickListener(v -> {
            check.setImageResource(R.drawable.baseline_favorite_25);
        });

        return binding.getRoot();

    }


    MusicProducts getProduct(int position) {
        return ((MusicProducts) getItem(position));
    }

}