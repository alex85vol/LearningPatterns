package com.learning.patterns.bussinessdelegate;

/**
 * Created by ovo on 10.02.2017.
 */
public class BusinessDelegate {

    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookupService.getBusssinessSevice(serviceType);
        businessService.doProcessing();
    }
}
