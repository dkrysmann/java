package CoffeMachine;


public class Cofee {
    private CoffeeSize coffeeSize;
    private CoffeType coffeType;

    public Cofee(String coffeeSize, String coffeType) {
        this.coffeeSize = CoffeeSize.valueOf(coffeeSize);
        this.coffeType = CoffeType.valueOf(coffeType);
    }
    public int getPrice(){
        return this.coffeeSize.getCoffeePrice();
    }

}
