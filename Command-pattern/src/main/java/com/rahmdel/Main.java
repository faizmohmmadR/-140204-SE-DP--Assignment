package com.rahmdel;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Device tv = new Device("TV");
        Device stereoSystem = new Device("Stereo System");

        Device light = new Light("Light");

        RemoteControl remoteControl = new RemoteControl();

        Command turnOnTvCommand = new TurnOnCommand(tv);
        remoteControl.pressButton(turnOnTvCommand);

        Command turnOffStereoCommand = new TurnOffCommand(stereoSystem);
        remoteControl.pressButton(turnOffStereoCommand);

        Command turnOnLightCommand = new TurnOnCommand(light);
        remoteControl.pressButton(turnOnLightCommand);

        remoteControl.showCommandHistory();

    }
}