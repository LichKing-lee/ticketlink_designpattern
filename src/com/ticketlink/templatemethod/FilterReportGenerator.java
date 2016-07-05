package com.ticketlink.templatemethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChangYong on 2016. 7. 3..
 */
public class FilterReportGenerator extends AbstractReportGenerator {
    @Override
    protected List<Customer> filterPoint(List<Customer> customerList) {
        List<Customer> resultList = new ArrayList<>();

        for(Customer customer : customerList){
            if(customer.getPoint() >= 100){
                resultList.add(customer);
            }
        }
        return resultList;
    }

    @Override
    protected String reportDataInTemplate(Customer customer) {
        return String.format("%d: %s\n", customer.getPoint(), customer.getName());
    }

    @Override
    protected String getSummaryMessage(List<Customer> customerList) {
        int sum = 0;

        for(Customer customer : customerList){
            sum += customer.getPoint();
        }

        return String.format("점수 합계: %d", sum);
    }
}
