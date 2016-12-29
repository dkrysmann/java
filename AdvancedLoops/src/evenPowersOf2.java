import java.util.Scanner;

public class evenPowersOf2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        evenPowers(num);

    }

    static void evenPowers(int count) {
        int n = 1;
        for (int i = 0; i <= count; i++) {
            if (i % 2 == 0) {
                System.out.println(n);
                n = n * 4;
            }
        }
    }
}
