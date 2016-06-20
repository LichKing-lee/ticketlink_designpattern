package com.ticketlink.state;

/**
 * Created by ChangYong on 2016. 6. 20..
 */
public class On implements State {
    @Override
    public void on(LightAfter lightAfter) {
        System.out.println("반응없음");
    }

    @Override
    public void off(LightAfter lightAfter) {
        lightAfter.setState(new Off());
    }
}
