package com.headfirst.ex3;

/**
 * Created by nori on 2014. 6. 13..
 */
public class Decaf extends Beverage{

    public Decaf() {
        description = "decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
