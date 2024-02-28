package com.rahmdel;
class Device {
    private final String name;
    private boolean isOn;

    public Device(String name) {
        this.name = name;
        this.isOn = false;
    }

    public void turnOn() {
        if (!isOn) {
            System.out.println(name + " is turned on");
            isOn = true;
        } else {
            System.out.println(name + " is already on");
        }
    }

    public void turnOff() {
        if (isOn) {
            System.out.println(name + " is turned of");
            isOn = false;
        } else {
            System.out.println(name + " is already of");
        }
    }
}
