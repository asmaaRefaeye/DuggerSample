package com.asmaahamed.duggersample.Entity;

import android.util.Log;

import com.asmaahamed.duggersample.Daggar.Engin;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngin implements Engin {
    private static final String TAG ="car";

    private int hoursePower;
    private int enginCapacity;

    @Inject
    public PetrolEngin(@Named("horse power") int horsePower,
                        @Named("engine capacity") int engineCapacity) {
        this.hoursePower = horsePower;
        this.enginCapacity = engineCapacity;
    }


    @Override
    public void start()
    {
        Log.d(TAG,"petrol Engin is started "+
                "\n HoursePower" +hoursePower
                +"\n EnginCapacity"+enginCapacity);
    }
}
