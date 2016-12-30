import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int num = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(num + " ");
                num++;
                if (num > n) {
                    break;
                }
            }
            System.out.println();
            if (num > n) {
                break;
            }
        }
    }
}