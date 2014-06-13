package com.headfirst.ex3;

/**
 * Created by nori on 2014. 6. 13..
 */
public abstract class Beverage {

    String description;

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
