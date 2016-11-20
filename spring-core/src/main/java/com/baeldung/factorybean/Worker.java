package com.baeldung.factorybean;

public class Worker {
    private String number;// standard setters and getters
    private Tool tool;// standard setters and getters

    public Worker() {
    }

    public Worker(String number, Tool tool) {
        this.number = number;
        this.tool = tool;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
}
