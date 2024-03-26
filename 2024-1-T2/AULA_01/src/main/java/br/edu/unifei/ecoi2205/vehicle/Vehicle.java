package br.edu.unifei.ecoi2205.vehicle;

public class Vehicle implements IVehicleOperations {
    private final String brand;
    private final String model;
    private final int wheelsNumber;
    private float mileage;
    private float parcialMileage;
    private final Motor motor;

    public Vehicle(String brand, String model, int wheelsNumber, float mileage, Motor motor) {
        this.brand = brand;
        this.model = model;
        this.wheelsNumber = wheelsNumber;
        this.mileage = mileage;
        this.parcialMileage = 0;
        this.motor = motor;
    }

    @Override
    public void start() {
        System.out.println("Starting " + this.getModel());
    }

    @Override
    public void travelBy(float miles) {
        this.parcialMileage += miles;
    }

    @Override
    public void stop() {
        System.out.println("Stopping " + this.getModel());
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

    public float consumptionByMileage() {
        return this.parcialMileage / motor.getFuelConsumption();
    }

    public float totalMileage() {
        this.setMileage(this.getMileage() + this.parcialMileage);
        this.parcialMileage = 0;
        return this.getMileage();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
