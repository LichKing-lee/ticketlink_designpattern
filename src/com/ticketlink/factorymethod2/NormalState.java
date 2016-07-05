package com.ticketlink.factorymethod2;

/**
 * Created by ChangYong on 2016. 7. 3..
 */
public class NormalState extends CarState {
    private static CarState carState;

    private NormalState(Car car){
        super(car);
    }

    public static CarState getInstance(Car car){
        if(carState == null){
            synchronized(LimpState.class) {
                if(carState == null){
                    carState = new NormalState(car);
                }
            }
        }

        return carState;
    }

    @Override
    public void speedUp(int targetSpeed) {
        System.out.println("speed: " + this.car.getSpeed());
        if(targetSpeed > this.car.getSpeed()){ this.car.setSpeed(targetSpeed); }
        System.out.println(" ==> " + this.car.getSpeed());
    }

    @Override
    public void engineFailedDetected() {
        System.out.println("speed: " + this.car.getSpeed());
        this.car.setSpeed(LimpState.LIMP_MODE_MAX_SPEED);
        System.out.println(" ==> " + this.car.getSpeed());
        this.car.setState(car.getLimpMode());
    }

    @Override
    public void engineRepaired() {
        System.out.println("Unexpected Event");
    }
}
