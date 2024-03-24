package br.edu.unifei.ecoi2205;

import br.edu.unifei.ecoi2205.vehicle.Fuel;
import br.edu.unifei.ecoi2205.vehicle.Motor;
import br.edu.unifei.ecoi2205.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        /*
            TO-DO:
         */
        Vehicle vehicle = new Vehicle("Ford", "Fiesta",
                4, 0, new Motor(1600, 100, 50, Fuel.GAS, 100));

        System.out.println(vehicle);
    }
}