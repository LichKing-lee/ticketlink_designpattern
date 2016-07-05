package com.ticketlink.templatemethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChangYong on 2016. 7. 3..
 */
public class ComplexReportGenerator {
    public String generate(List<Customer> customerList){
        List<Customer> filterList = new ArrayList<>();
        for(Customer customer : customerList){
            if(customer.getPoint() >= 100){
                filterList.add(customer);
            }
        }

        String report = String.format("고객 수 : %d명입니다.\n", filterList.size());
        int sum = 0;
        for(Customer customer : filterList){
            report += String.format("%d: %s\n", customer.getPoint(), customer.getName());
            sum += customer.getPoint();
        }
        report += String.format("점수 합계: %d", sum);

        return report;
    }
}
