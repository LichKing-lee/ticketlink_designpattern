package com.ticketlink.templatemethod;

/**
 * Created by ChangYong on 2016. 7. 3..
 */
public class Customer {
    private String name;
    private int point;

    public Customer(String name, int point){
        this.setName(name);
        this.setPoint(point);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPoint(int point){
        this.point = point;
    }

    public int getPoint(){
        return this.point;
    }
}
