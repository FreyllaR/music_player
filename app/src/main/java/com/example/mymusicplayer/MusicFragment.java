package com.example.mymusicplayer;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.mymusicplayer.databinding.FragmentMusic2Binding;

import java.util.ArrayList;

public class MusicFragment extends Fragment {

    private FragmentMusic2Binding binding;

    BoxAdapter boxAdapter;

    ImageButton butcheck;

    ListView lvMain;

    static ArrayList<MusicProducts> products = new ArrayList<MusicProducts>();

    public MusicFragment() {

    }


    public Context getCtx() {
        return getActivity().getApplicationContext();
    }
    public static MusicFragment newInstance(int page) {
        MusicFragment fragment = new MusicFragment();
        Bundle args = new Bundle();
        args.putInt("num", page);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentMusic2Binding.inflate(inflater, container, false);
        fillData();
        boxAdapter = new BoxAdapter(getCtx(), products);
        lvMain = binding.lvMain;
        lvMain.setAdapter(boxAdapter);
        return binding.getRoot();
    }


    void fillData(){
        for(int i = 0; i < 5; i++){
            products.add(new MusicProducts(R.drawable.disk, "песня " + i, butcheck));
        }
    }

}