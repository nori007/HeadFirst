package com.headfirst.ex3;

/**
 * Created by nori on 2014. 6. 13..
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
