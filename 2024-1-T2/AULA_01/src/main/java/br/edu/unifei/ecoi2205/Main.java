package br.edu.unifei.ecoi2205;

import br.edu.unifei.ecoi2205.vehicle.Car;
import br.edu.unifei.ecoi2205.vehicle.Fuel;
import br.edu.unifei.ecoi2205.vehicle.Motor;
import br.edu.unifei.ecoi2205.vehicle.Vehicle;
import br.edu.unifei.ecoi2205.vehicle.Truck;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("Ford", "Fiesta", 0,
                new Motor(1600, 100, 50, Fuel.GAS, 9));
        vehicles[1] = new Car("Ford", "Ecosport", 0,
                new Motor(2000, 150, 50, Fuel.GAS, 10));
        vehicles[3] = new Truck("VW", "24280", 0,
                new Motor(4000, 450, 80, Fuel.DIESEL, 15));
        vehicles[2] = new Car("VW", "Fox", 0,
                new Motor(1000, 95, 50, Fuel.ALCOHOL, 12));

        JOptionPane.showMessageDialog(null, "A basic JOptionPane message dialog");

        for(Vehicle v : vehicles) {
            if (v instanceof Car) {
                System.out.println("You are a car!");
            } else if (v instanceof Truck) {
                System.out.println("You are a truck!");
            }
            v.start();
            System.out.println(v.toString());
            v.travelBy((float) (Math.random()*100));
            v.travelBy((float) (Math.random()*100));
            System.out.println(v.toString());
            System.out.println("\tFuel\t" + v.getMotor().getType().description);
            System.out.println("\tConsumption by mileage: " +
                    v.consumptionByMileage());
            v.stop();
            System.out.println(v.totalMileage() + "km");
        }
    }
}