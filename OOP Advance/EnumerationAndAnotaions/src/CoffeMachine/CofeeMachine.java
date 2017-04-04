package CoffeMachine;


import java.util.ArrayList;
import java.util.List;

public class CofeeMachine {
    private List<Cofee> cofees;
    private List<Coin> coins;

    public CofeeMachine() {
        this.cofees = new ArrayList<>();
        this.coins = new ArrayList<>();
    }
    public void buyCoffee(String size,String type){
        Cofee cofee = new Cofee(size,type);
        int sumCoins = this.coins.stream().mapToInt(Coin::getCoins).sum();
        if(sumCoins > cofee.getPrice()){
            this.cofeesSold.add(cofee);
            this.coins.clear();
        }
    }
    public void addCoins(String coin){
        Coin currentCoint = Coin.valueOf(coin.toUpperCase());
        this.coins.add(currentCoint);
    }
    public Iterable<Cofee> cofeeSold(){
        return this.cofeesSold;
    }
}
