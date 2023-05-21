package com.example.belezza;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.belezza.databinding.FragmentMusic2Binding;

import java.util.ArrayList;

public class MusicFragment extends Fragment {

    private FragmentMusic2Binding binding;

    String[] names_of_songs = {"Кукла колдуна - Король и Шут", "Komarovo - DVRST", "Marmalade - Miyagi, Andy Panda, Mav-D", "Пачка сигарет - КИНО", "Blinding Lights - The Weeknd", "Numb - LinkinPark", "Brother Louie - Modern Talking", "Отпускай - Три дня дождя", "Thunder - Imagine Dragons", "Mockingbird - Eminem"};

    int[] myImageList = new int[]{R.drawable.kukla_kolduna, R.drawable.komarovo, R.drawable.marmelade, R.drawable.pachka_sigaret, R.drawable.blinding_lights, R.drawable.numb_linkin, R.drawable.brother_louie, R.drawable.otpuskai, R.drawable.thunder, R.drawable.eminem_mock};

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
        lvMain.setDivider(null);
        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
                if(position == 0){
                    getActivity().stopService(new Intent(getActivity(), SoundService10.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService9.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService8.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService7.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService6.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService5.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService4.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService3.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService2.class));
                    getActivity().startService(new Intent(getActivity(), SoundService.class));
                }else if(position == 1){
                    getActivity().stopService(new Intent(getActivity(), SoundService10.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService9.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService8.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService7.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService6.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService5.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService4.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService3.class));
                    getActivity().startService(new Intent(getActivity(), SoundService2.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService.class));
                }else if(position == 2){
                    getActivity().stopService(new Intent(getActivity(), SoundService10.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService9.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService8.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService7.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService6.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService5.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService4.class));
                    getActivity().startService(new Intent(getActivity(), SoundService3.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService2.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService.class));
                }else if(position == 3){
                    getActivity().stopService(new Intent(getActivity(), SoundService10.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService9.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService8.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService7.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService6.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService5.class));
                    getActivity().startService(new Intent(getActivity(), SoundService4.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService3.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService2.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService.class));
                }else if(position == 4){
                    getActivity().stopService(new Intent(getActivity(), SoundService10.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService9.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService8.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService7.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService6.class));
                    getActivity().startService(new Intent(getActivity(), SoundService5.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService4.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService3.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService2.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService.class));
                }else if(position == 5){
                    getActivity().stopService(new Intent(getActivity(), SoundService10.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService9.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService8.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService7.class));
                    getActivity().startService(new Intent(getActivity(), SoundService6.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService5.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService4.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService3.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService2.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService.class));
                }else if(position == 6){
                    getActivity().stopService(new Intent(getActivity(), SoundService10.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService9.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService8.class));
                    getActivity().startService(new Intent(getActivity(), SoundService7.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService6.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService5.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService4.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService3.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService2.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService.class));
                }else if(position == 7){
                    getActivity().stopService(new Intent(getActivity(), SoundService10.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService9.class));
                    getActivity().startService(new Intent(getActivity(), SoundService8.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService7.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService6.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService5.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService4.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService3.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService2.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService.class));;
                }else if(position == 8){
                    getActivity().stopService(new Intent(getActivity(), SoundService10.class));
                    getActivity().startService(new Intent(getActivity(), SoundService9.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService8.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService7.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService6.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService5.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService4.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService3.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService2.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService.class));
                }else if(position == 9){
                    getActivity().startService(new Intent(getActivity(), SoundService10.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService9.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService8.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService7.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService6.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService5.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService4.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService3.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService2.class));
                    getActivity().stopService(new Intent(getActivity(), SoundService.class));
                }
            }
        });
        return binding.getRoot();
    }


    void fillData(){
        for(int i = 0; i < 10; i++){
            products.add(new MusicProducts(myImageList[i], names_of_songs[i], butcheck));
        }
    }

}