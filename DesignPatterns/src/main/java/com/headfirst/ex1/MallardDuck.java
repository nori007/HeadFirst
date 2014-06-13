package com.headfirst.ex1;

/**
 * Created by nori on 2014. 6. 12..
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("믈오리입니다.");
    }
}
