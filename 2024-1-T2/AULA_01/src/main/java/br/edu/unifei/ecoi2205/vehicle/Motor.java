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

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getPotency() {
        return potency;
    }

    public void setPotency(int potency) {
        this.potency = potency;
    }

    public float getFuelLiters() {
        return fuelLiters;
    }

    public void setFuelLiters(float fuelLiters) {
        this.fuelLiters = fuelLiters;
    }

    public Fuel getType() {
        return type;
    }

    public void setType(Fuel type) {
        this.type = type;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
