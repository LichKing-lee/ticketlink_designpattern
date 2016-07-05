package com.ticketlink.factorymethod;

/**
 * Created by ChangYong on 2016. 7. 3..
 */
public abstract class Motor {
    private MotorStatus motorStatus;

    public Motor(){
        this.motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus(){
        return this.motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus){
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction){
        MotorStatus motorStatus = this.getMotorStatus();

        if(motorStatus == MotorStatus.MOVING){ return; }

        moveMotor(direction);
        this.setMotorStatus(MotorStatus.MOVING);
    }

    protected abstract void moveMotor(Direction direction);

    public void stop(){
        this.motorStatus = MotorStatus.STOPPED;
    }
}
