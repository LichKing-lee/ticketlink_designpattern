package com.ticketlink.abstractfactory;

/**
 * Created by ChangYong on 2016. 7. 4..
 */
public class Client {
    public static void main(String[] args){
        NavigationFactory factory = new HighNavigationFactory();

        GPS gps = factory.createGPS();
        Screen screen = factory.createScreen();
        PathFinder pathFinder = factory.createPathFinder();

        Map map = factory.createMap();
        screen.drawMap(map);

        Location l1 = gps.findCurrentLocation();
        Location l2 = gps.findCurrentLocation();

        pathFinder.findPath(l1, l2);
    }
}
