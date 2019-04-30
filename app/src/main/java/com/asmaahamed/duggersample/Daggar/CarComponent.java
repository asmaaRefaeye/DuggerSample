package com.asmaahamed.duggersample.Daggar;

import com.asmaahamed.duggersample.Entity.Car;
import com.asmaahamed.duggersample.View.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component (modules = {WheelsModule.class,PetrolEnginModule.class})
public interface CarComponent {

    Car  getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);


        CarComponent build();
    }
}
