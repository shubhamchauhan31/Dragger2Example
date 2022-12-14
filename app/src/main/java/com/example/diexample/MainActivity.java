package com.example.diexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponents carComponents=DaggerCarComponents.create();
       // first method
     //   car= carComponents.getCar();

        // second method

        carComponents.getAllCar(this);
        car.drive();
    }
}