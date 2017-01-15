import java.util.Scanner;

public class createArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] test = new int[10];
        test[0] = 1;
        test[1] = 2;
        test[2] = 3;
        test[3] = 4;
        test[4] = 5;
        test[5] = 6;
        test[6] = 7;
        test[7] = 8;
        test[8] = 9;
        test[9] = 10;
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i] + "+" + "2" + "=" + (test[i] + 2));
        }
    }
}
