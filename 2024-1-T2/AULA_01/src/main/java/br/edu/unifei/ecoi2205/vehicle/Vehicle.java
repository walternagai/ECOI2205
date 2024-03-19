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

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public Motor getMotor() {
        return motor;
    }

    @Override
    public void start() {
        System.out.println("Starting " + this.getModel());
    }

    @Override
    public void travelBy(float miles) {
        this.setMileage(this.getMileage() + miles);
        System.out.println("Go through " + miles + " miles");
    }

    @Override
    public void stop() {
        System.out.println("Stopping " + this.getModel());
    }
}
