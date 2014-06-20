package com.headfirst.ex6;

/**
 * Created by nori on 2014. 6. 16..
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
