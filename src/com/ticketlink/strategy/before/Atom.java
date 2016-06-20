package com.ticketlink.strategy.before;

/**
 * Created by ChangYong on 2016. 6. 20..
 */
public class Atom extends Robot {
    public Atom(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("아톰 attack~~~!!!");
    }

    @Override
    public void move() {
        System.out.println("아톰 move~~~!!!");
    }
}
