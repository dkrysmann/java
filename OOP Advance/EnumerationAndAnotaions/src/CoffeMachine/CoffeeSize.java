package CoffeMachine;


public enum CoffeeSize {
    SMALL(50,50),NORMAL(100,75),DOUBLE(200,100);
    private int coffeeSize;
    private int coffeePrice;
    CoffeeSize(int size,int price){
        this.coffeeSize = size;
        this.coffeePrice = price;
    }
    public int getCoffeeSize(){
        return this.coffeeSize;
    }
    public int getCoffeePrice(){
        return this.coffeePrice;
    }
}
