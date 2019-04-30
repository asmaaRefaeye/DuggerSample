package com.asmaahamed.duggersample.Daggar;

import com.asmaahamed.duggersample.Daggar.Engin;
import com.asmaahamed.duggersample.Entity.DieslEngin;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  class DieslEnginModule {

    private int hoursePower;

    public DieslEnginModule(int hoursePower)
    {
        this.hoursePower = hoursePower;
    }

    @Provides
     Engin provideEngin(){
     return new DieslEngin(hoursePower);
    }

}
