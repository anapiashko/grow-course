package com.port.grow;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Berth> berths = new ArrayList<>();
        berths.add(new Berth("berth_1"));
        berths.add(new Berth("berth_2"));


        Port port = new Port("Delig", 300, berths);

        Ship ship1 = new Ship("1", 3, 15);
        Ship ship2 = new Ship("2", 4, 16);
        Ship ship3 = new Ship("3", 5, 25);

        Thread tr1 = new Thread(new Trading(port, ship1, 5, 4));
        Thread tr2 = new Thread(new Trading(port,ship2, 5,90));
        Thread tr3 = new Thread(new Trading(port, ship3, 65, 5));
        tr1.start();
        tr2.start();
        tr3.start();
    }


}
