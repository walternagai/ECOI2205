package br.edu.unifei.ecoi2205.vehicle;

public class Motor {
    private final int cylinders;
    private final int potency;
    private final float fuelLiters;
    private final Fuel type;
    private final float fuelConsumption;

    public Motor(int cylinders, int potency, float fuelLiters, Fuel type, float fuelConsumption) {
        this.cylinders = cylinders;
        this.potency = potency;
        this.fuelLiters = fuelLiters;
        this.type = type;
        this.fuelConsumption = fuelConsumption;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }
}
