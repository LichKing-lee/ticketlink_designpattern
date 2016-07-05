package com.ticketlink.factorymethod2;

/**
 * Created by ChangYong on 2016. 7. 3..
 */
public class Car {
    private int speed;
    private CarState normalState;
    private CarState limpState;
    private CarState curState;

    public Car(){
        this.normalState = Factory.getState(this, CarStateType.NORMAL);
        this.limpState = Factory.getState(this, CarStateType.LIMP);
        this.curState = this.normalState;
    }

    public CarState getLimpMode(){
        return this.limpState;
    }

    public void setState(CarState state){
        this.curState = state;
    }

    public void speedDown(int targetSpeed){
        curState.speedDown(targetSpeed);
    }

    public void engineFailedDetected(){
        this.curState.engineFailedDetected();
    }

    public void speedUp(int targetSpeed){
        this.curState.speedUp(targetSpeed);
    }

    public void engineRepaired(){
        this.curState.engineRepaired();
    }

    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public CarState getNormalState(){
        return this.normalState;
    }
}
