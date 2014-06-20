package com.headfirst.ex5;

/**
 * Created by nori on 2014. 6. 13..
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getChocolateBoiler(){
        if(chocolateBoiler == null){
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }

    public void fill(){
        if(isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(!isEmpty() && !isBoiled()){
            empty = true;
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
