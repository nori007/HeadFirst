package com.headfirst.ex3;

/**
 * Created by nori on 2014. 6. 13..
 */
public class HouseBlend extends  Beverage{

    public HouseBlend() {
        description = "houseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
