package com.test1.vo.myapplication.Module;

/**
 * Created by vinh on 11/14/2017.
 */

public class Motor {
    private int rpm;
    public  Motor(){
        rpm=0;
    }

    public void brakeMotor(){
        rpm=0;
    }

    public void accelerate(int value){
        rpm+=value;
    }

    public int getRpm(){
      return rpm;
    }
}
