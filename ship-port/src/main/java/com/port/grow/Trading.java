package com.port.grow;

public class Trading implements Runnable {

    private Port port;

    private Ship ship;

    private int inPort;

    private int outPort;

    public Trading(Port port, Ship ship, int inPort, int outPort) {
        this.port = port;
        this.ship = ship;
        this.inPort = inPort;
        this.outPort = outPort;
    }

    @Override
    public void run() {
        System.out.println("TRADING");

        ship.arriving(port);

        give_get();

        ship.setContainers(outPort);
        ship.leaving(port);

        System.out.println(port);
    }

    private synchronized void give_get() {

        port.give(outPort);
        port.get(inPort);
    }

}
