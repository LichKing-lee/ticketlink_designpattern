package com.ticketlink.templatemethod;

import java.util.List;

/**
 * Created by ChangYong on 2016. 7. 3..
 */
public class TotalReportGenerator extends AbstractReportGenerator {
    @Override
    protected List<Customer> filterPoint(List<Customer> customerList) {
        return customerList;
    }

    @Override
    protected String reportDataInTemplate(Customer customer) {
        return String.format("%s: %d\n", customer.getName(), customer.getPoint());
    }

    @Override
    protected String getSummaryMessage(List<Customer> customerList) {
        return "";
    }
}
