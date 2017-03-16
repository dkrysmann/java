package CarShopExtend;


import java.io.Serializable;

public class Audi implements Car,Serializable,Rentable{
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;
    private Integer minRentDays;
    private Double pricePerDays;

    public Audi(String model, String color, Integer horsePower,String countryProduced, Integer minRentDays, Double pricePerDays) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
        this.minRentDays = minRentDays;
        this.pricePerDays = pricePerDays;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDays;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDays;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    public String getCountryProduced() {
        return countryProduced;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %s tires",this.getModel(),this.getCountryProduced(),
                Car.TIRES);
    }
}
