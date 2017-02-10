package com.learning.patterns.bussinessdelegate;

/**
 * Created by ovo on 10.02.2017.
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        businessService.doTask();
    }
}
