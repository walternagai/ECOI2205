package br.edu.unifei.ecoi2205.vehicle;

public class Vehicle implements IVehicleOperations {
    private final String brand;
    private final String model;
    private final int wheelsNumber;
    private float mileage;
    private final Motor motor;

    public Vehicle(String brand, String model, int wheelsNumber, float mileage, Motor motor) {
        this.brand = brand;
        this.model = model;
        this.wheelsNumber = wheelsNumber;
        this.mileage = mileage;
        this.motor = motor;
    }
}
