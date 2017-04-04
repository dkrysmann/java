package CardPower;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rank = reader.readLine().toUpperCase();
        String suit = reader.readLine().toUpperCase();
        CardRank rank1 = CardRank.valueOf(rank);
        CardSuit suit1 = CardSuit.valueOf(suit);
        Card cards = new Card(rank1,suit1);
        System.out.println(cards);
    }
}
