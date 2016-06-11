package com.ticketlink.ocp;

import java.util.Calendar;

/**
 * Created by ChangYong on 2016. 6. 11..
 */
public class ConcreteTicketReserve {
    public boolean isPossiblebuyTicket(int money){
        int price = 10000;
        int today = Calendar.getInstance().getTime().getDay();

        if(today == 3){
            price = (int) (price * 0.9);
        }

        return money >= price;
    }
}
