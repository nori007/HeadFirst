package com.headfirst.ex6;

/**
 * Created by nori on 2014. 6. 16..
 */
public class RemoteControlTest {

    public static void main(String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasProessed();

        GarageDoorOpen garageDoorOpen = new GarageDoorOpen();
        GarageDoorOpenCommand garageDoorOpenUp = new GarageDoorOpenCommand(garageDoorOpen);

        remote.setCommand(garageDoorOpenUp);
        remote.buttonWasProessed();
    }
}
