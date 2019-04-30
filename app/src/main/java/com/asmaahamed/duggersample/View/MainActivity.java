package com.asmaahamed.duggersample.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.asmaahamed.duggersample.Daggar.DaggerCarComponent;
import com.asmaahamed.duggersample.Daggar.DieslEnginModule;
import com.asmaahamed.duggersample.Entity.Car;
import com.asmaahamed.duggersample.R;
import com.asmaahamed.duggersample.Daggar.CarComponent;


import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    /* CarComponent component = DaggerCarComponent.builder()
                .dieslEnginModule(new DieslEnginModule(100))
                .build();

       component.inject(this);*/
       // car=component.getCar();


        CarComponent component = DaggerCarComponent.builder()
                .horsePower(100)
                .engineCapacity(1500)
                .build();

        component.inject(this);

        car.drive();

    }
}
