package com.ticketlink.abstractfactory;

/**
 * Created by ChangYong on 2016. 7. 4..
 */
public class HighNavigationFactory implements NavigationFactory {
    @Override
    public GPS createGPS() {
        return new ExpensiveGPS();
    }

    @Override
    public Screen createScreen() {
        return new HDScreen();
    }

    @Override
    public PathFinder createPathFinder() {
        return new FastPathFinder();
    }

    @Override
    public Map createMap() {
        return new LargeMap();
    }
}
