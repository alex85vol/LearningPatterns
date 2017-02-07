package com.learning.patterns.abstractfabric;

/**
 * Created by ovo on 07.02.2017.
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
