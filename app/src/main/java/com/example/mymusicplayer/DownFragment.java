package com.example.mymusicplayer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mymusicplayer.databinding.FragmentDown2Binding;

public class DownFragment extends Fragment {

    private FragmentDown2Binding binding;

    public DownFragment() {

    }
    public static DownFragment newInstance(int page) {
        DownFragment fragment = new DownFragment();
        Bundle args = new Bundle();
        args.putInt("num", page);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_down2, container, false);
    }
}