package com.rahmdel;

class TurnOffCommand implements Command {
    private final Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void excute() {
        device.turnOff();
    }
}
