package com.learning.patterns.bussinessdelegate;

/**
 * Created by ovo on 10.02.2017.
 */
public class BusinessLookUp {

    public BusinessService getBusssinessSevice(String serviceType) {

        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
