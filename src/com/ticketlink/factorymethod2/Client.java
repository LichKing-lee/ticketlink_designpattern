package com.ticketlink.factorymethod2;

/**
 * Created by ChangYong on 2016. 7. 3..
 */
public class Client {
    public static void main(String[] args){
        Car car = new Car();
        car.speedUp(150);
        car.speedDown(130);

        car.engineFailedDetected();

        car.speedUp(100);
        car.speedDown(30);

        car.speedUp(50);
        car.speedUp(100);

        car.engineRepaired();
        car.speedUp(100);
    }
}
