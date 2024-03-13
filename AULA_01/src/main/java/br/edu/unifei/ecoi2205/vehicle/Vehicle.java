package br.edu.unifei.ecoi2205.vehicle;

public class Vehicle implements IVehicleOperations {
    private String brand;
    private String model;
    private int wheelsNumber;
    private float mileage;
    private Motor motor;

    public Vehicle(String brand, String model, int wheelsNumber, float mileage, Motor motor) {
        this.brand = brand;
        this.model = model;
        this.wheelsNumber = wheelsNumber;
        this.mileage = mileage;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return new String("\tBrand\t" + this.brand + "\n" +
                "\tModel\t" + this.model + "\n" +
                "\tMilage\t" + this.mileage);
    }
}
