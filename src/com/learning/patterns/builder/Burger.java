package com.learning.patterns.builder;

/**
 * Created by ovo on 09.02.2017.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
