package com.ticketlink.abstractfactory;

/**
 * Created by ChangYong on 2016. 7. 4..
 */
public class CheapGPS extends GPS {
    @Override
    public Location findCurrentLocation() {
        System.out.println("Find current location with Cheap GPS");
        return null;
    }
}
