package com.ticketlink.factorymethod2;

/**
 * Created by ChangYong on 2016. 7. 3..
 */
public class LimpState extends CarState {
    public static final int LIMP_MODE_MAX_SPEED = 60;
    private static CarState carState = null;

    private LimpState(Car car){
        super(car);
    }

    public static CarState getInstance(Car car){
        if(carState == null){
            synchronized(LimpState.class) {
                if(carState == null){
                    carState = new LimpState(car);
                }
            }
        }

        return carState;
    }

    @Override
    public void speedUp(int targetSpeed) {
        System.out.println("speed: " + this.car.getSpeed());
        if(targetSpeed > this.car.getSpeed() && targetSpeed < LIMP_MODE_MAX_SPEED){ this.car.setSpeed(targetSpeed); }
        System.out.println(" ==> " + this.car.getSpeed());
    }

    @Override
    public void engineFailedDetected() {

    }

    @Override
    public void engineRepaired() {
        this.car.setState(this.car.getNormalState());
    }
}
