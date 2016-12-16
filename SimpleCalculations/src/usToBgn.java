import java.util.Scanner;

public class usToBgn {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double oneUSD = 1.79549;
        double inputUSD = Double.parseDouble(console.nextLine());
        double convertor = inputUSD * oneUSD;
        System.out.printf("%.2f BGN",convertor);
    }
}
