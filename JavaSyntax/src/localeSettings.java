import java.util.Locale;
import java.util.Scanner;

public class localeSettings {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("BG","BG"));
        Scanner console = new Scanner(System.in);
        double value = console.nextDouble();
        System.out.println(value);
    }
}
