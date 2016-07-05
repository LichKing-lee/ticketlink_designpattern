package com.ticketlink.abstractfactory;

/**
 * Created by ChangYong on 2016. 7. 4..
 */
public class LowNavigationFactory implements NavigationFactory {
    @Override
    public GPS createGPS() {
        return new CheapGPS();
    }

    @Override
    public Screen createScreen() {
        return new SDScreen();
    }

    @Override
    public PathFinder createPathFinder() {
        return new SlowPathFinder();
    }

    @Override
    public Map createMap() {
        return new SmallMap();
    }
}
