package com.ticketlink.strategy.before;

/**
 * Created by ChangYong on 2016. 6. 20..
 */
public abstract class Robot {
    private String name;

    public Robot(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract void attack();
    public abstract void move();
}
