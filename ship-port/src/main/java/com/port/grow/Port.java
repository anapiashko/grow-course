package com.port.grow;

import java.util.List;

public class Port {

    private String name;

    private int containers;

    private int capacity;

    private List<Berth> berths;

    public Port(String name, int capacity, List<Berth> berths) {
        this.name = name;
        this.capacity = capacity;
        setBerths(berths);
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

    public List<Berth> getBerths() {
        return berths;
    }

    public void setBerths(List<Berth> berths) {
        this.berths = berths;
        for (Berth berth : this.berths) {
            berth.setPort(this);
        }
    }

    @Override
    public String toString() {
        return "Port{" +
                "name = '" + name + '\'' +
                "containers = " + containers +
                ", capacity = " + capacity +
                ", berths = " + berths +
                '}';
    }

    public void give(int containers) {
        try {
            int temp = this.containers - containers;
            if (temp < 0) {
                throw new ArithmeticException();
            }
            this.containers = temp;

        } catch (ArithmeticException e) {
            System.out.println("There is only " + this.containers + " in the port");
        }
    }

    public void get(int containers) {
        try {
            int temp = this.containers + containers;
            if (temp > this.capacity) {
                throw new ArithmeticException();
            }

            this.containers = temp;
        } catch (ArithmeticException e) {
            System.out.println("The capacity of this port is " + this.capacity);
        }
    }
}
