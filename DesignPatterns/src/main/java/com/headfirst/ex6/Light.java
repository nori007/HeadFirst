package com.headfirst.ex6;

/**
 * Created by nori on 2014. 6. 16..
 */
public class Light {
    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public Light() {

    }

    public void on() {
        System.out.println(location + " light is on");
    }

    public void off() {
        System.out.println(location + " light is off");
    }
}
