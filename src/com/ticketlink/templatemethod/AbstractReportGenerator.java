package com.ticketlink.templatemethod;

import java.util.List;

/**
 * Created by ChangYong on 2016. 7. 3..
 */
public abstract class AbstractReportGenerator {
    public String generate(List<Customer> customerList){
        List<Customer> targetList = filterPoint(customerList);

        String report = String.format("고객 수 : %d명입니다.\n", targetList.size());
        for(Customer customer : targetList){
            report += reportDataInTemplate(customer);//String.format("%d: %s\n", customer.getPoint(), customer.getName());
        }
        report += getSummaryMessage(targetList);
        return report;
    }

    abstract protected List<Customer> filterPoint(List<Customer> customerList);
    abstract protected String reportDataInTemplate(Customer customer);
    abstract protected String getSummaryMessage(List<Customer> customerList);
}
