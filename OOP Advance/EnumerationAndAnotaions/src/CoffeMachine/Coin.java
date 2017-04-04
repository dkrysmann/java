package CoffeMachine;


public enum Coin {
    ONE(1),TWO(2),FIVE(5),TEN(10),TWENTY(20),FOURTY(50);
    private int coins;
    Coin(int coin){
        this.coins = coin;
    }
    public int getCoins(){
        return this.coins;
    }
}
