package com.ticketlink.abstractfactory;

/**
 * Created by ChangYong on 2016. 7. 4..
 */
public class HDScreen extends Screen {
    @Override
    public void drawMap(Map map) {
        System.out.println("Draw map " + map.getClass().getName() + " on HD screen");
    }
}
