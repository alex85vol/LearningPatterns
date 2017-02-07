package com.learning.patterns.abstractfabric;

/**
 * Created by ovo on 07.02.2017.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
