package com.headfirst.ex1;

/**
 * Created by nori on 2014. 6. 12..
 */
public class MiniDuckSimulator {

    public static void main(String[] args){

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.perfromQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.perfromQuack();
    }
}
