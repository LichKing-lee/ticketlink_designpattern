package com.ticketlink.strategy.before;

/**
 * Created by ChangYong on 2016. 6. 20..
 */
class TaekwonV extends Robot{
    public TaekwonV(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("태권브이 attack~~~!!!");
    }

    @Override
    public void move() {
        System.out.println("태권브이 move~~~!!!");
    }
}