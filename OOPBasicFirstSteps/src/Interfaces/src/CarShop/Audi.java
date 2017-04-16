package CarShop;


public class Audi implements Rentable,Sellable{
    private String model;
    private String color;
    private int horsePower;
    private int minRentDays;
    private double pricePerDay;
    private double sellPrice;

    public Audi(String model,String color,int horsePower,int minRentDays,double pricePerDay,double sellPrice){
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.minRentDays = minRentDays;
        this.pricePerDay = pricePerDay;
        this.sellPrice = sellPrice;
    }

    @Override
    public int getMinRentDays() {
        return this.minRentDays;
    }

    @Override
    public double getPricePerDay() {
        return this.pricePerDay;
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
    public int getHorsePower() {
        return this.horsePower;
    }
    @Override
    public double getPrice() {
        return this.sellPrice;
    }

    @Override
    public String toString() {
        return String.format("%s is %s color and have %d horse power.Minimal rent days - %d," +
                        "Price per day - %.2f,Sell price - %.3f"
                ,this.getModel(),this.getColor(),this.getHorsePower(),
                this.getMinRentDays(),this.getPricePerDay(),this.getPrice());
    }


}
