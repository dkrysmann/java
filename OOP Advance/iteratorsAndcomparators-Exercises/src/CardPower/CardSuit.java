package CardPower;


public enum CardSuit {
    CLUBS(0),DIAMONDS(13),HEARTS(26),SPADES(39);
    private int power;
    private CardSuit(int suitPower){
        this.power = suitPower;
    }
    public int getPower(){
        return this.power;
    }
}
