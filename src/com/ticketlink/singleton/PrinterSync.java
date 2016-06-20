package com.ticketlink.singleton;

/**
 * Created by ChangYong on 2016. 6. 20..
 */
public class PrinterSync {
    private static PrinterSync printer = null;

    private PrinterSync(){}

    public synchronized static PrinterSync getPrinter(){
        if(printer == null){
            printer = new PrinterSync();
        }

        return printer;
    }
}
