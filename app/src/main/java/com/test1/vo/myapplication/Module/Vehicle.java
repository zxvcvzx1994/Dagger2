package com.test1.vo.myapplication.Module;

import javax.inject.Inject;

/**
 * Created by vinh on 11/14/2017.
 */

public class Vehicle {
    Motor motor;
    @Inject
    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void stop(){
        motor.brakeMotor();
    }

    public int getSpeed(){
        return motor.getRpm();
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }
}
