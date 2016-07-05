package com.ticketlink.factorymethod2;

/**
 * Created by ChangYong on 2016. 7. 4..
 */
public class Factory {
    public static CarState getState(Car car, CarStateType type){
        if(CarStateType.LIMP == type){
            return LimpState.getInstance(car);
        }else {
            return NormalState.getInstance(car);
        }
    }
}
