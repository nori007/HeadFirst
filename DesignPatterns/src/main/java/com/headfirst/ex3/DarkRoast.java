package com.headfirst.ex3;

/**
 * Created by nori on 2014. 6. 13..
 */
public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
