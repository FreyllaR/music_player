package com.example.belezza;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.belezza.databinding.FragmentMusic2Binding;
import com.example.belezza.databinding.FragmentProfile2Binding;

public class ProfileFragment extends Fragment {


    private FragmentProfile2Binding binding;

    EditText edname, ednumb;

    SharedPreferences prefs;


    public ProfileFragment() {

    }
    public static ProfileFragment newInstance(int page) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putInt("num", page);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentProfile2Binding.inflate(inflater, container, false);
        edname = binding.edname;
        ednumb = binding.ednumber;
        prefs = getActivity().getSharedPreferences("com.example.belezza", MODE_PRIVATE);
        return binding.getRoot();
    }

    @Override
    public void onStop() {
        super.onStop();
        prefs.edit().putString("name", edname.getText().toString()).apply();
        prefs.edit().putString("number", ednumb.getText().toString()).apply();

    }

    @Override
    public void onStart() {
        super.onStart();
        edname.setText(prefs.getString("name", ""));
        ednumb.setText(prefs.getString("number", ""));
    }
}