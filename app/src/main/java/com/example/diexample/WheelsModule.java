package com.example.diexample;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims rims(){
        return new Rims();
    }

    @Provides
   static Tires tires(){
        Tires tires=new Tires();
        tires.inflate();
        return tires;
    }
    @Provides
    static Wheels provideWheels(Rims rims,Tires tires){

    return new Wheels(rims,tires);
}
}
