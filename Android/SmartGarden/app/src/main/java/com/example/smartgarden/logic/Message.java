package com.example.smartgarden.logic;

public class Message {

    private Command command;
    private RiegoStandard riego = null;

    public Message(Command command, RiegoStandard riego) {
        this.command = command;
        this.riego  = riego;
    }

    public Message(Command command) {
        this.command = command;
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder(String.format("<%s", command.toString()));
        if(riego != null) {
            toString.append(riego.toString());
        }
        return String.format("%s>", toString);
    }

}
