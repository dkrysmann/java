import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] test = new int[4][4];
        test[0][0] = 1;
        test[1][1] = 2;
        test[2][2] = 3;
        test[3][3] = 4;
        for (int i = 0; i <test.length ; i++) {
            int[]subArr = test[i];
            for (int j = 0; j < subArr.length; j++) {
                System.out.print(subArr[j] + " ");
            }
            System.out.println();
        }
    }
}
