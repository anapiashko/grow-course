package com.port.grow;

import java.util.List;

public class Ship {

    private String name;

    private int containers;

    private int capacity;

    private Berth berth;

    public Ship() {
    }

    public Ship(String name, int containers, int capacity) {
        this.name = name;
        this.containers = containers;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContainers() {
        return containers;
    }

    public void setContainers(int containers) {
        this.containers = containers;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Berth getBerth() {
        return berth;
    }

    public void setBerth(Berth berth) {
        this.berth = berth;
    }

    public Berth arriving(Port port) {

        System.out.println("ARRAVING START");
        List<Berth> berths = port.getBerths();

        for (Berth berth : berths) {

            if (berth.isVacant()) {
                this.berth = berth;
                berth.setVacant(false);
                System.out.println("ARRAVING END IN IF");
                //System.out.println(this.toString() + " arrived " + this.berth.toString());
                return berth;
            }
        }

        System.out.println("ARRAVING END IN END");
        return null;
    }

    public void leaving (Port port){

        System.out.println("LEAVING START");

        List<Berth> berths = port.getBerths();

        for (Berth berth : berths) {

            if (berth.equals(this.berth)) {
                berth.setVacant(true);

                //System.out.println(this.toString() + " left " + this.berth.toString());
                this.berth = null;
                break;
            }
        }

        System.out.println("LEAVING END");

    }
    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", containers=" + containers +
                ", capacity=" + capacity +
                ", berth=" + berth +
                '}';
    }
}
