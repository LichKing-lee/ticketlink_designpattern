package com.ticketlink.ocp;

/**
 * Created by ChangYong on 2016. 6. 11..
 */
public class ClientTicketReserve {
    Calculable calculable;

    public void setCalculable(Calculable calculable){
        this.calculable = calculable;
    }

    public boolean isPossiblebuyTicket(int money){
        int price = 10000;

        price = calculable.calculatePrice(price);

        return money >= price;
    }
}
