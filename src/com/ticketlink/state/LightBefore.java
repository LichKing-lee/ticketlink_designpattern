package com.ticketlink.state;

/**
 * Created by ChangYong on 2016. 6. 20..
 */
public class LightBefore {
    private static int ON = 0;
    private static int OFF = 1;
    private int state;

    public LightBefore(){
        this.state = OFF;
    }

    public void on(){
        if(state == ON){
            System.out.println("반응없음");
        }else{
            System.out.println("LightBefore On");
            state = ON;
        }
    }

    public void off(){
        if(state == OFF){
            System.out.println("반응없음");
        }else{
            System.out.println("LightBefore Off");
            state = OFF;
        }
    }
}
