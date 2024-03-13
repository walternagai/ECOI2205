package br.edu.unifei.ecoi2205;

import br.edu.unifei.ecoi2205.vehicle.Fuel;
import br.edu.unifei.ecoi2205.vehicle.Motor;
import br.edu.unifei.ecoi2205.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(4, 100, 50, Fuel.GAS, 50);
        Vehicle vehicle = new Vehicle("Apple", "Silverbullet", 4, 0, motor);

        System.out.print(vehicle);
        vehicle.start();
        vehicle.travelBy(2000);
        vehicle.stop();
    }
}