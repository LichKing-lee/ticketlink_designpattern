package com.ticketlink.singleton;

/**
 * Created by ChangYong on 2016. 6. 20..
 */
public class Printer {
    private static Printer printer = null;

    private Printer(){}

    public static Printer getPrinter(){
        if(printer == null){
            printer = new Printer();
        }

        return printer;
    }
}
