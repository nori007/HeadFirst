package com.headfirst.ex3;

/**
 * Created by nori on 2014. 6. 13..
 */
public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
