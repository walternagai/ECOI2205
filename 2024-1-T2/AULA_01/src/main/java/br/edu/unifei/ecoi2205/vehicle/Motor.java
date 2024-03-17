package br.edu.unifei.ecoi2205.vehicle;

public class Motor {
    private int cylinders;
    private int potency;
    private float fuelLiters;
    private Fuel type;
    private float fuelConsumption;

    public Motor(int cylinders, int potency, float fuelLiters, Fuel type, float fuelConsumption) {
        this.cylinders = cylinders;
        this.potency = potency;
        this.fuelLiters = fuelLiters;
        this.type = type;
        this.fuelConsumption = fuelConsumption;
    }
}
