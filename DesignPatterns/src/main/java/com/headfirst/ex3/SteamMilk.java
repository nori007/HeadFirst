package com.headfirst.ex3;

/**
 * Created by nori on 2014. 6. 13..
 */
public class SteamMilk extends CondimentDecorator{

    Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", steamMilk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
