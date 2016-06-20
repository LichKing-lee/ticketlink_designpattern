package com.ticketlink.state;

/**
 * Created by ChangYong on 2016. 6. 20..
 */
public class Off implements State {
    @Override
    public void on(LightAfter lightAfter) {
        lightAfter.setState(new On());
    }

    @Override
    public void off(LightAfter lightAfter) {
        System.out.println("반응 없음");
    }
}
