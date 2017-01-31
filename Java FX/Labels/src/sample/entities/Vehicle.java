package entities;

import entities.Entity;

public abstract class Vehicle extends Entity {
    private int fuelCapacity;
    private int fuel;
    private int healthPoints;

    public Vehicle(String name, int fuelCapacity, int healthPoints) throws Exception {
        super(name, "NEUTRAL");
        setHealthPoints(healthPoints);
    }

    private void setFuelCapacity(int fuelCapacity) throws Exception {
        if (fuelCapacity <= 0)
            throw new Exception("Invalid Vehicle Fuel Capacity Value");
        else
            this.fuelCapacity = fuelCapacity;
    }

    public int getFuelCapacity() { return this.fuelCapacity; }

    private void setHealthPoints(int healthPoints) throws Exception {
        if (healthPoints <= 0)
            throw new Exception("Invalid Vehicle Health Points Value");
        else
            this.healthPoints = healthPoints;
    }

    public int getHealthPoints() { return this.healthPoints; }

    public void travel(int distance) throws Exception {
        if (this.fuel == 0)
            throw new Exception("Vehicle Is Out Of Fuel");
        if (distance > this.fuel)
            throw new Exception("Vehicle Will Run Out Of Fuel");
        // TODO: implement location classes, etc.
    }
}
