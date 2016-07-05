package com.ticketlink.abstractfactory;

/**
 * Created by ChangYong on 2016. 7. 4..
 */
public class ExpensiveGPS extends GPS {
    @Override
    public Location findCurrentLocation() {
        System.out.println("Find current location with Expensive GPS");
        return null;
    }
}
