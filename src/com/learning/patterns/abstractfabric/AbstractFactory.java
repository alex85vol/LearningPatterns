package com.learning.patterns.abstractfabric;

/**
 * Created by ovo on 07.02.2017.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
