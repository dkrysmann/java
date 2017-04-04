package CardSiut;


public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Card Suits:").append(System.lineSeparator());
        for (CardSuit cards : CardSuit.values()) {
            builder.append(String.format("Ordinal value: %s; Name value: %s%n",cards.ordinal(),cards.name()));
        }
        System.out.println(builder.toString().trim());
    }
}
