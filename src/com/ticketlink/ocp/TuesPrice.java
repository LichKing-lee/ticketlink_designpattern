package com.ticketlink.ocp;

/**
 * Created by ChangYong on 2016. 6. 11..
 */
public class TuesPrice implements Calculable {
    @Override
    public int calculatePrice(int price) {
        return (int) (price * 0.9);
    }
}
