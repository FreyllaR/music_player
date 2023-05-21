package com.example.belezza;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyAdapter extends FragmentStateAdapter {

    public MyAdapter(FragmentActivity fragmentActivity){
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 0){
            return (MusicFragment.newInstance(position));
        }else if (position == 1){
            return (DownFragment.newInstance(position));
        }else if(position == 2){
            return (FavouriteFragment.newInstance(position));
        }else if(position == 3){
            return (ProfileFragment.newInstance(position));
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
