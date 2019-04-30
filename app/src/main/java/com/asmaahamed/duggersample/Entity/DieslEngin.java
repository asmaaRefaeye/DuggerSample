package com.asmaahamed.duggersample.Entity;

import android.util.Log;

import com.asmaahamed.duggersample.Daggar.Engin;

public class DieslEngin implements Engin {

    private static final String TAG ="car";

    private int horsePower;

    public DieslEngin(int horsePower  ) {
        this.horsePower=horsePower;
    }

    @Override
    public void start() {

        Log.d(TAG,"Diesl Engin is started . HoursePower" + horsePower);
    }
}
