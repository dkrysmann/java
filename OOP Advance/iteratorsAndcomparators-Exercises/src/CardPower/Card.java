package CardPower;


public class Card {
    private CardRank rank;
    private CardSuit suit;

    Card(CardRank rank,CardSuit suit){
        this.rank = rank;
        this.suit = suit;
    }
    CardRank getRank(){
        return this.rank;
    }
    CardSuit getSuit() {
        return this.suit;
    }
    int getPower(){
        return this.suit.getPower() + this.rank.getPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %s",this.getRank(),this.getSuit(),this.getPower());
    }
}
