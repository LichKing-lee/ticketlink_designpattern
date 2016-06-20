package com.ticketlink.strategy.after;

/**
 * Created by ChangYong on 2016. 6. 20..
 */
public class MissileStrategy implements Attackable {
    @Override
    public void attack() {
        System.out.println("missile punch");
    }
}
