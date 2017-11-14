package com.test1.vo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.test1.vo.myapplication.Controller.ComponentVehicle;
import com.test1.vo.myapplication.Controller.DaggerComponentVehicle;
import com.test1.vo.myapplication.Module.ModuleVehicle;
import com.test1.vo.myapplication.Module.Vehicle;

public class MainActivity extends AppCompatActivity {
    private static final String TAG =MainActivity.class.getSimpleName() ;
    private Vehicle vehicle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ComponentVehicle componentVehicle = DaggerComponentVehicle.builder().moduleVehicle(new ModuleVehicle()).build();
        vehicle = componentVehicle.ProvideVehicle();
        Log.i(TAG, "onCreate: "+vehicle.getSpeed());
    }
}
