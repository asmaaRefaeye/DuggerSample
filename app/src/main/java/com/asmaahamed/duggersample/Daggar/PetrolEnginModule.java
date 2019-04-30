package com.asmaahamed.duggersample.Daggar;

import com.asmaahamed.duggersample.Daggar.Engin;
import com.asmaahamed.duggersample.Entity.PetrolEngin;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEnginModule {

    @Binds
    abstract Engin bindEngin(PetrolEngin engin);

}
