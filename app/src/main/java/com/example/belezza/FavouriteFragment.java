package com.example.belezza;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.belezza.databinding.FragmentFavourite2Binding;

public class FavouriteFragment extends Fragment {

    private FragmentFavourite2Binding binding;

    public FavouriteFragment() {

    }
    public static FavouriteFragment newInstance(int page) {
        FavouriteFragment fragment = new FavouriteFragment();
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
        return inflater.inflate(R.layout.fragment_favourite2, container, false);
    }
}