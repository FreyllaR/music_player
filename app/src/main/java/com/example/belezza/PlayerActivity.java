package com.example.belezza;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.belezza.databinding.ActivityPlayerBinding;

public class PlayerActivity extends AppCompatActivity {

    private ActivityPlayerBinding binding;

    int[] song_icon = new int[]{R.drawable.kukla_kolduna, R.drawable.komarovo, R.drawable.marmelade, R.drawable.pachka_sigaret, R.drawable.blinding_lights, R.drawable.numb_linkin, R.drawable.brother_louie, R.drawable.otpuskai, R.drawable.thunder, R.drawable.eminem_mock};

    ImageView song;

    ImageButton play, next, prev;

    int i = 0;

    int q = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPlayerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        song = binding.imageViewofsong;
        next = binding.imageButtonnext;
        prev = binding.imageButtonprev;
        play = binding.imageButtonstop;
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        i = 0;
        if(intent.hasExtra("kuklakolduna")){
            i = 0;
            song.setImageResource(song_icon[0]);
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (q == 0){
                        play_song(0);
                        play.setImageResource(R.drawable.baseline_pause_24);
                        q = 1;
                    }else{
                        play.setImageResource(R.drawable.baseline_play_arrow_24);
                        check(3);
                        q = 0;
                    }
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i <= 0){
                        i = 1;
                    }
                    set_icon(i - 1);
                    i -= 1;
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i >= 9){
                        i = 8;
                    }
                    set_icon(i + 1);
                    i += 1;
                }
            });
        }else if(intent.hasExtra("komarovo")){
            song.setImageResource(song_icon[1]);
            i = 1;
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (q == 0){
                        play_song(0);
                        play.setImageResource(R.drawable.baseline_pause_24);
                        q = 1;
                    }else{
                        play.setImageResource(R.drawable.baseline_play_arrow_24);
                        check(3);
                        q = 0;
                    }
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i >= 9){
                        i = 8;
                    }
                    set_icon(i + 1);
                    i += 1;
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i <= 0){
                        i = 1;
                    }
                    set_icon(i - 1);
                    i -= 1;
                }
            });
        }else if(intent.hasExtra("marmalade")){
            song.setImageResource(song_icon[2]);
            i = 2;
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (q == 0){
                        play_song(0);
                        play.setImageResource(R.drawable.baseline_pause_24);
                        q = 1;
                    }else{
                        play.setImageResource(R.drawable.baseline_play_arrow_24);
                        check(3);
                        q = 0;
                    }
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i >= 9){
                        i = 8;
                    }
                    set_icon(i + 1);
                    i += 1;
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i <= 0){
                        i = 1;
                    }
                    set_icon(i - 1);
                    i -= 1;
                }
            });
        }else if(intent.hasExtra("pachkasigaret")){
            song.setImageResource(song_icon[3]);
            i = 3;
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (q == 0){
                        play_song(0);
                        play.setImageResource(R.drawable.baseline_pause_24);
                        q = 1;
                    }else{
                        play.setImageResource(R.drawable.baseline_play_arrow_24);
                        check(3);
                        q = 0;
                    }
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i >= 9){
                        i = 8;
                    }
                    set_icon(i + 1);
                    i += 1;
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i <= 0){
                        i = 1;
                    }
                    set_icon(i - 1);
                    i -= 1;
                }
            });
        }else if(intent.hasExtra("blindlight")){
            song.setImageResource(song_icon[4]);
            i = 4;
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (q == 0){
                        play_song(0);
                        play.setImageResource(R.drawable.baseline_pause_24);
                        q = 1;
                    }else{
                        play.setImageResource(R.drawable.baseline_play_arrow_24);
                        check(3);
                        q = 0;
                    }
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i >= 9){
                        i = 8;
                    }
                    set_icon(i + 1);
                    i += 1;
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i <= 0){
                        i = 1;
                    }
                    set_icon(i - 1);
                    i -= 1;
                }
            });
        }else if(intent.hasExtra("numb")){
            song.setImageResource(song_icon[5]);
            i = 5;
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (q == 0){
                        play_song(0);
                        play.setImageResource(R.drawable.baseline_pause_24);
                        q = 1;
                    }else{
                        play.setImageResource(R.drawable.baseline_play_arrow_24);
                        check(3);
                        q = 0;
                    }
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i >= 9){
                        i = 8;
                    }
                    set_icon(i + 1);
                    i += 1;
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i <= 0){
                        i = 1;
                    }
                    set_icon(i - 1);
                    i -= 1;
                }
            });
        }else if(intent.hasExtra("brolou")){
            song.setImageResource(song_icon[6]);
            i = 6;
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (q == 0){
                        play_song(0);
                        play.setImageResource(R.drawable.baseline_pause_24);
                        q = 1;
                    }else{
                        play.setImageResource(R.drawable.baseline_play_arrow_24);
                        check(3);
                        q = 0;
                    }
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i >= 9){
                        i = 8;
                    }
                    set_icon(i + 1);
                    i += 1;
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i <= 0){
                        i = 1;
                    }
                    set_icon(i - 1);
                    i -= 1;
                }
            });
        }else if(intent.hasExtra("otpuskai")){
            song.setImageResource(song_icon[7]);
            i = 7;
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (q == 0){
                        play_song(0);
                        play.setImageResource(R.drawable.baseline_pause_24);
                        q = 1;
                    }else{
                        play.setImageResource(R.drawable.baseline_play_arrow_24);
                        check(3);
                        q = 0;
                    }
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i >= 9){
                        i = 8;
                    }
                    set_icon(i + 1);
                    i += 1;
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i <= 0){
                        i = 1;
                    }
                    set_icon(i - 1);
                    i -= 1;
                }
            });
        }else if(intent.hasExtra("thunder")){
            song.setImageResource(song_icon[8]);
            i = 8;
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (q == 0){
                        play_song(0);
                        play.setImageResource(R.drawable.baseline_pause_24);
                        q = 1;
                    }else{
                        play.setImageResource(R.drawable.baseline_play_arrow_24);
                        check(3);
                        q = 0;
                    }
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i >= 9){
                        i = 8;
                    }
                    set_icon(i + 1);
                    i += 1;
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i <= 0){
                        i = 1;
                    }
                    set_icon(i - 1);
                    i -= 1;
                }
            });
        }else if(intent.hasExtra("mockin")){
            song.setImageResource(song_icon[9]);
            i = 9;
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (q == 0){
                        play_song(0);
                        play.setImageResource(R.drawable.baseline_pause_24);
                        q = 1;
                    }else{
                        play.setImageResource(R.drawable.baseline_play_arrow_24);
                        check(3);
                        q = 0;
                    }
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i >= 9){
                        i = 8;
                    }
                    set_icon(i + 1);
                    i += 1;
                }
            });
            prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i <= 0){
                        i = 1;
                    }
                    set_icon(i - 1);
                    i -= 1;
                }
            });
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home){
            Intent intent = new Intent(this, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
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

    public void play_song(int pos){
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


    public void set_icon(int pos){
        if(pos == 0){
            song.setImageResource(R.drawable.kukla_kolduna);
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
            song.setImageResource(R.drawable.komarovo);
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
            song.setImageResource(R.drawable.marmelade);
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
            song.setImageResource(R.drawable.pachka_sigaret);
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
            song.setImageResource(R.drawable.blinding_lights);
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
            song.setImageResource(R.drawable.numb_linkin);
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
            song.setImageResource(R.drawable.brother_louie);
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
            song.setImageResource(R.drawable.otpuskai);
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
            song.setImageResource(R.drawable.thunder);
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
            song.setImageResource(R.drawable.eminem_mock);
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