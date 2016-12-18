import java.util.Scanner;

public class classRoom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double h = Double.parseDouble(console.nextLine()) * 100;
        double w = Double.parseDouble(console.nextLine()) * 100;
        double rows = Math.floor(h / 120);
        double tables = Math.floor((w - 100) / 70);
        double res = (rows * tables) - 3;
        System.out.println(res);
    }
}
