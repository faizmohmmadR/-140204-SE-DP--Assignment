package com.rahmdel;

import java.util.ArrayList;
import java.util.List;


class RemoteControl {
    private final List<Command> commandHistory = new ArrayList<>();

    public void pressButton(Command command) {
        command.excute();
        commandHistory.add(command);
    }

    public void showCommandHistory() {
        System.out.println("Command History");
        for (Command command : commandHistory) {
            System.out.println(command.getClass().getSimpleName());
        }
    }

}
