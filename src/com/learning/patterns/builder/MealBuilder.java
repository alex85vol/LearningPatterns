package com.learning.patterns.builder;

/**
 * Created by ovo on 09.02.2017.
 */
public class MealBuilder {

    public Meal prepareVegMeal () {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal () {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
