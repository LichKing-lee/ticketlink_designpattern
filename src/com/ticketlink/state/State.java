package com.ticketlink.state;

/**
 * Created by ChangYong on 2016. 6. 20..
 */
public interface State {
    void on(LightAfter lightAfter);
    void off(LightAfter lightAfter);
}
