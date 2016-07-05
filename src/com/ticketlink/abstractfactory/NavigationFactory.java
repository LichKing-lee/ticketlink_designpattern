package com.ticketlink.abstractfactory;

/**
 * Created by ChangYong on 2016. 7. 4..
 */
public interface NavigationFactory {
    GPS createGPS();
    Screen createScreen();
    PathFinder createPathFinder();
    Map createMap();
}
