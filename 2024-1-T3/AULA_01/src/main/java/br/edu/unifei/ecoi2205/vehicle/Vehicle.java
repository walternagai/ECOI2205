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

    public Motor getMotor() {
        return motor;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    @Override
    public void start() {
        System.out.println("Starting thex'x' motor of " + this.model);
    }

    @Override
    public void travelBy(float kilometers) {
        this.setMileage(this.getMileage() + kilometers);
        System.out.println("Go through " + kilometers + "km");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the motor of " + this.model);
    }

    @Override
    public String toString() {
        return new String("\tBrand\t" + this.getBrand() + "\n" +
                "\tModel\t" + this.model + "\n" +
                "\tMilage\t" + this.mileage);
    }

    public float consumptionByMileage() {
        return this.mileage / motor.getFuelConsumption();
    }
}
