package com.example.diexample;

import javax.inject.Inject;

import dagger.Component;

@Component
public interface CarComponents {

    Car getCar();

    // second method

    void getAllCar(MainActivity mainActivity);
}
