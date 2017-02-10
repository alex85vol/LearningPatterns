package com.learning.patterns.bussinessdelegate;

/**
 * Created by ovo on 10.02.2017.
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");

    }
}
