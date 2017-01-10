import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double skumriaKgPrice = Double.parseDouble(input.nextLine());
        double cacaKgRice = Double.parseDouble(input.nextLine());
        double palamudKgPrice = Double.parseDouble(input.nextLine());
        double safridKgPRice = Double.parseDouble(input.nextLine());
        double midiKgPrice = Double.parseDouble(input.nextLine());
        double midi = 7.5;
        double palamudPrice = skumriaKgPrice + ((skumriaKgPrice * 0.6));
        double palamudSum = palamudPrice * palamudKgPrice;
        double safridPrice = cacaKgRice + ((cacaKgRice * 0.8));
        double safridSum = safridKgPRice * safridPrice;
        double midiSum = midiKgPrice * midi;
        double total = (palamudSum + safridSum + midiSum);
        System.out.printf("%.2f",total);
    }
}
