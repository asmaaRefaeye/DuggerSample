package com.asmaahamed.duggersample.Entity;

import android.util.Log;

import com.asmaahamed.duggersample.Daggar.Engin;

import javax.inject.Inject;

public class Car  {

    private  static final String TAG ="Car";

    private Engin engin ;
    private   wheels wheels ;
   @Inject
    public Car(Engin engin, wheels wheels) {
        this.engin = engin;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote ){
       remote.setListener(this);
    }


    public void drive()
    {
        engin.start();
        Log.d(TAG,"Driving......");
    }

}
