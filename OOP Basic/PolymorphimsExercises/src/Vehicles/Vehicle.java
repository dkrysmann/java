package Vehicles;


public abstract class Vehicle {
    private final double FUEL_CONSUMPTION_INCREASE = this.getClass().getSimpleName().equals("Truck") ? 1.6 : 0.9;
    private double fuelQuantity;
    private double fuelConsumationPerKm;
    public Vehicle(double fuelQuantity,double fuelConsumationPerKm){
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumationPerKm(fuelConsumationPerKm);
    }

    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumationPerKm() {
        return this.fuelConsumationPerKm;
    }

    public void setFuelConsumationPerKm(double fuelConsumationPerKm) {
        this.fuelConsumationPerKm = fuelConsumationPerKm;
    }
    protected void driveInKm(double km){
       double consumation = km * (this.getFuelConsumationPerKm() + FUEL_CONSUMPTION_INCREASE);
       if(consumation > this.getFuelQuantity()){
           throw new IllegalArgumentException(this.getClass().getSimpleName() + " needs refueling");
       }
       this.setFuelQuantity(this.getFuelQuantity() - consumation);
    }
    protected void refuel(double liters){
        double totalLiters = this.getClass().getSimpleName().equals("Truck") ? liters -= liters * 0.5 : liters;
        this.setFuelQuantity(this.getFuelQuantity() + totalLiters);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",this.getClass().getSimpleName(),this.getFuelQuantity());
    }
}
