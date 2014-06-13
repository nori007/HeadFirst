package com.headfirst.ex1;

/**
 * Created by nori on 2014. 6. 13..
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("모형 오리입니다.");
    }
}
