package com.example.mymusicplayer;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class MusicProducts extends ArrayList<Parcelable> implements Parcelable {
    String mustext;

    ImageButton btn;

    Integer img;

    MusicProducts(Integer ibutton, String _describe, ImageButton butt){
        img = ibutton;
        mustext = _describe;
        btn = butt;
    }

    protected MusicProducts(Parcel in) {
    }

    public static final Creator<MusicProducts> CREATOR = new Creator<MusicProducts>() {
        @Override
        public MusicProducts createFromParcel(Parcel in) {
            return new MusicProducts(in);
        }

        @Override
        public MusicProducts[] newArray(int size) {
            return new MusicProducts[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
    }
}
