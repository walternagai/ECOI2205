package br.edu.unifei.ecoi2205;

import br.edu.unifei.ecoi2205.vehicle.Car;
import br.edu.unifei.ecoi2205.vehicle.Fuel;
import br.edu.unifei.ecoi2205.vehicle.Motor;
import br.edu.unifei.ecoi2205.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        /*
            TO-DO:
         */
        Car myCar = new Car("Ford", "Fiesta", 0, new Motor(1600, 100, 50, Fuel.ALCOHOL, 10));

        System.out.println(myCar.getMileage());
        myCar.start();
        myCar.travelBy(100);
        myCar.stop();
        System.out.println(myCar.getMileage());
    }
}