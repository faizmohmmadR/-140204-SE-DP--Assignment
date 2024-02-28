package com.rahmdel;

class TurnOnCommand implements Command {
    private final Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void excute() {
        device.turnOn();
    }
}
