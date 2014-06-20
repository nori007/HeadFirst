package com.headfirst.ex6;

/**
 * Created by nori on 2014. 6. 16..
 */
public class GarageDoorOpenCommand implements Command{
    GarageDoorOpen garageDoorOpen;

    public GarageDoorOpenCommand(GarageDoorOpen garageDoorOpen) {
        this.garageDoorOpen = garageDoorOpen;
    }

    @Override
    public void execute() {
        garageDoorOpen.up();
    }
}
