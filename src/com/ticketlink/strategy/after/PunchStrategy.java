package com.ticketlink.strategy.after;

/**
 * Created by ChangYong on 2016. 6. 20..
 */
public class PunchStrategy implements Attackable {
    @Override
    public void attack() {
        System.out.println("strong punch");
    }
}
