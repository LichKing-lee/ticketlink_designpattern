package com.ticketlink.templatemethod;

import sun.java2d.pipe.SpanShapeRenderer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ChangYong on 2016. 7. 3..
 */
public class Client {
    public static void main(String[] args){
        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer("설현", 150));
        customerList.add(new Customer("수지", 80));
        customerList.add(new Customer("혜리", 180));
        customerList.add(new Customer("유라", 120));
        customerList.add(new Customer("쯔위", 190));

        SimpleReportGenerator simpleReportGenerator = new SimpleReportGenerator();
        ComplexReportGenerator complexReportGenerator = new ComplexReportGenerator();
        System.out.println(simpleReportGenerator.generate(customerList));
        System.out.println(complexReportGenerator.generate(customerList));

        AbstractReportGenerator reportGenerator = new TotalReportGenerator();
        System.out.println(reportGenerator.generate(customerList));
        reportGenerator = new FilterReportGenerator();
        System.out.println(reportGenerator.generate(customerList));
    }
}
