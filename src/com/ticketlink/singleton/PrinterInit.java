package com.ticketlink.singleton;

/**
 * Created by ChangYong on 2016. 6. 20..
 */
public class PrinterInit {
    private static PrinterInit printInit = new PrinterInit();

    private PrinterInit(){}

    public static PrinterInit getPrinter(){

        return printInit;
    }
}
