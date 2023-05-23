package com.example.belezza;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.os.Bundle;


import com.example.belezza.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        FragmentStateAdapter pageAdapter = new MyAdapter(this);
        binding.pager.setAdapter(pageAdapter);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(binding.tabLayout, binding.pager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if(position == 0){
                    tab.setText("Музыка");
                    tab.setIcon(R.drawable.icon_music);
                } else if (position == 1){
                    tab.setText("Загрузки");
                    tab.setIcon(R.drawable.icon_down);
                } else if (position == 2){
                    tab.setText("Профиль");
                    tab.setIcon(R.drawable.icon_acc);
                }
            }
        });
        tabLayoutMediator.attach();
    }
}
