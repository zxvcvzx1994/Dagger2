package com.test1.vo.myapplication.Controller;

import com.test1.vo.myapplication.Module.ModuleVehicle;
import com.test1.vo.myapplication.Module.Vehicle;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by vinh on 11/14/2017.
 */
@Singleton
@Component(modules = ModuleVehicle.class)
public interface ComponentVehicle {
    Vehicle ProvideVehicle();
}
