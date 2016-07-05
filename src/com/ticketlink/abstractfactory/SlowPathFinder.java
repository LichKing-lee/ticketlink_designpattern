package com.ticketlink.abstractfactory;

/**
 * Created by ChangYong on 2016. 7. 4..
 */
public class SlowPathFinder extends PathFinder {
    @Override
    public Path findPath(Location from, Location to) {
        System.out.println("Slow Path Finder");
        return null;
    }
}
