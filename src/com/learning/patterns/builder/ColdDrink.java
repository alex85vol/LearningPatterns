package com.learning.patterns.builder;

/**
 * Created by ovo on 09.02.2017.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
