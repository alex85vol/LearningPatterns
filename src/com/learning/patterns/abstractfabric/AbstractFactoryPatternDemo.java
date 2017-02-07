package com.learning.patterns.abstractfabric;

/**
 * Created by ovo on 07.02.2017.
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shapeFirst = shapeFactory.getShape("CIRCLE");
        shapeFirst.draw();

        Shape shapeSecond = shapeFactory.getShape("RECTANGLE");
        shapeSecond.draw();

        Shape shapeThird = shapeFactory.getShape("SQUARE");
        shapeThird.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color colorOne = colorFactory.getColor("RED");
        colorOne.fill();

        Color colorSecond = colorFactory.getColor("GREEN");
        colorSecond.fill();

        Color colorThird = colorFactory.getColor("BLUE");
        colorThird.fill();
    }
}
