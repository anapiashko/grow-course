package com.port.grow;

public class Berth {

    private String name;

    private boolean vacant;

    private Port port;

    public Berth() {
    }

    public Berth(String name) {
        this.name = name;
        this.vacant = true;
    }

    public Berth(String name, boolean vacant) {
        this.name = name;
        this.vacant = vacant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVacant() {
        return vacant;
    }

    public void setVacant(boolean vacant) {
        this.vacant = vacant;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Berth{" +
                "name='" + name + '\'' +
                ", vacant=" + vacant +
                '}';
    }
}
