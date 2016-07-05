package com.ticketlink.factorymethod;

/**
 * Created by ChangYong on 2016. 7. 3..
 */
public class HyundaiMotor extends Motor {
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move Hyundai Motor " + direction);
    }
}
