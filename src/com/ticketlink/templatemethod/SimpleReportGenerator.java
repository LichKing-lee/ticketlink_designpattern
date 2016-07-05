package com.ticketlink.templatemethod;

import java.util.List;

/**
 * Created by ChangYong on 2016. 7. 3..
 */
public class SimpleReportGenerator {
    public String generate(List<Customer> customerList){
        String report = String.format("고객 수 : %d명\n", customerList.size());
        for(Customer customer : customerList){
            report += String.format("%s: %d\n", customer.getName(), customer.getPoint());
        }

        return report;
    }
}
