package com.example.belezza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.belezza.databinding.ActivityPlayerBinding;

public class PlayerActivity extends AppCompatActivity {

    private ActivityPlayerBinding binding;

    int[] song_icon = new int[]{R.drawable.kukla_kolduna, R.drawable.komarovo, R.drawable.marmelade, R.drawable.pachka_sigaret, R.drawable.blinding_lights, R.drawable.numb_linkin, R.drawable.brother_louie, R.drawable.otpuskai, R.drawable.thunder, R.drawable.eminem_mock};

    ImageView song;

    ImageButton play, next, prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPlayerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        song = binding.imageViewofsong;
        next = binding.imageButtonnext;
        prev = binding.imageButtonprev;
        play = binding.imageButtonstop;
        Intent intent = getIntent();
        if(intent.hasExtra("kuklakolduna")){
            song.setImageResource(song_icon[0]);
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    play.setImageResource(R.drawable.baseline_play_arrow_24);
                    check(0);
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song.setImageResource(song_icon[1]);
                    switch_song(1);
                }
            });
        }else if(intent.hasExtra("komarovo")){
            song.setImageResource(song_icon[1]);
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    play.setImageResource(R.drawable.baseline_play_arrow_24);
                    check(1);
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song.setImageResource(song_icon[2]);
                    switch_song(2);
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song.setImageResource(song_icon[0]);
                    switch_song(0);
                }
            });
        }else if(intent.hasExtra("marmalade")){
            song.setImageResource(song_icon[2]);
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    play.setImageResource(R.drawable.baseline_play_arrow_24);
                    check(2);
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song.setImageResource(song_icon[3]);
                    switch_song(3);
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song.setImageResource(song_icon[1]);
                    switch_song(1);
                }
            });
        }else if(intent.hasExtra("pachkasigaret")){
            song.setImageResource(song_icon[3]);
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    play.setImageResource(R.drawable.baseline_play_arrow_24);
                    check(3);
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song.setImageResource(song_icon[4]);
                    switch_song(4);
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song.setImageResource(song_icon[2]);
                    switch_song(2);
                }
            });
        }else if(intent.hasExtra("blindlight")){
            song.setImageResource(song_icon[4]);
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    play.setImageResource(R.drawable.baseline_play_arrow_24);
                    check(4);
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song.setImageResource(song_icon[5]);
                    switch_song(5);
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song.setImageResource(song_icon[3]);
                    switch_song(3);
                }
            });
        }else if(intent.hasExtra("numb")){
            song.setImageResource(song_icon[5]);
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    play.setImageResource(R.drawable.baseline_play_arrow_24);
                    check(5);
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song.setImageResource(song_icon[6]);
                    switch_song(6);
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song.setImageResource(song_icon[4]);
                    switch_song(4);
                }
            });
        }else if(intent.hasExtra("brolou")){
            song.setImageResource(song_icon[6]);
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    play.setImageResource(R.drawable.baseline_play_arrow_24);
                    check(6);
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song.setImageResource(song_icon[7]);
                    switch_song(7);
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song.setImageResource(song_icon[5]);
                    switch_song(5);
                }
            });
        }else if(intent.hasExtra("otpuskai")){
            song.setImageResource(song_icon[7]);
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    play.setImageResource(R.drawable.baseline_play_arrow_24);
                    check(7);
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song.setImageResource(song_icon[8]);
                    switch_song(8);
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song.setImageResource(song_icon[6]);
                    switch_song(6);
                }
            });
        }else if(intent.hasExtra("thunder")){
            song.setImageResource(song_icon[8]);
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    play.setImageResource(R.drawable.baseline_play_arrow_24);
                    check(8);
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song.setImageResource(song_icon[9]);
                    switch_song(9);
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song.setImageResource(song_icon[7]);
                    switch_song(7);
                }
            });
        }else if(intent.hasExtra("mockin")){
            song.setImageResource(song_icon[9]);
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    play.setImageResource(R.drawable.baseline_play_arrow_24);
                    check(9);
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song.setImageResource(song_icon[8]);
                    switch_song(8);
                }
            });
        }
    }

    public void check(int pos){
        if(pos == 0){
            stopService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }else if(pos == 1){
            stopService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }else if(pos == 2){
            stopService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }else if(pos == 3){
            stopService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }else if(pos == 4){
            stopService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }else if(pos == 5){
            stopService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }else if(pos == 6){
            stopService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }else if(pos == 7){
            stopService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }else if(pos == 8){
            stopService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }else if(pos == 9){
            stopService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }
    }

    public void switch_song(int pos){
        if(pos == 0){
            stopService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            startService(new Intent(this, SoundService.class));
        }else if(pos == 1){
            stopService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            startService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }else if(pos == 2){
            stopService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            startService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }else if(pos == 3){
            stopService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            startService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }else if(pos == 4){
            stopService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            startService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }else if(pos == 5){
            stopService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            startService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }else if(pos == 6){
            stopService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            startService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }else if(pos == 7){
            stopService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            startService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }else if(pos == 8){
            stopService(new Intent(this, SoundService10.class));
            startService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }else if(pos == 9){
            startService(new Intent(this, SoundService10.class));
            stopService(new Intent(this, SoundService9.class));
            stopService(new Intent(this, SoundService8.class));
            stopService(new Intent(this, SoundService7.class));
            stopService(new Intent(this, SoundService6.class));
            stopService(new Intent(this, SoundService5.class));
            stopService(new Intent(this, SoundService4.class));
            stopService(new Intent(this, SoundService3.class));
            stopService(new Intent(this, SoundService2.class));
            stopService(new Intent(this, SoundService.class));
        }
    }

}