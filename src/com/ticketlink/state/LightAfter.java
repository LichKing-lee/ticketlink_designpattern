package com.ticketlink.state;

/**
 * Created by ChangYong on 2016. 6. 20..
 */
public class LightAfter {
    private State state;

    public LightAfter(){
        state = new Off();
    }

    public void on(){
        state.on(this);
    }

    public void off(){
        state.off(this);
    }

    public void setState(State state){
        this.state = state;
    }
}
