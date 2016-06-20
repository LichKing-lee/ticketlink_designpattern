package com.ticketlink.strategy.after;

/**
 * Created by ChangYong on 2016. 6. 20..
 */
public abstract class Robot {
    private String name;
    private Attackable attackable;

    public Robot(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void attack(){
        attackable.attack();
    }

    public void setAttackable(Attackable attackable){
        this.attackable = attackable;
    }
}
