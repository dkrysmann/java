package CardRank;


public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Card Ranks:").append(System.lineSeparator());
        for (CardRank cardRank : CardRank.values()) {
            builder.append(String.format("Ordinal value: %s; Name value: %s%n",cardRank.ordinal(),cardRank.name()));
        }
        System.out.println(builder.toString().trim());
    }
}
