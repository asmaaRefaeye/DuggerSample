package com.asmaahamed.duggersample.Daggar;

import com.asmaahamed.duggersample.Entity.Rims;
import com.asmaahamed.duggersample.Entity.Tires;
import com.asmaahamed.duggersample.Entity.wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return  tires;
    }

    @Provides
    static wheels provideWheels(Rims rims , Tires tires){
        return new wheels(rims ,tires);
    }
}
