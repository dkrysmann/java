import java.util.Scanner;
import java.util.Arrays;
public class TwoDiminssionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = Integer.parseInt(input.nextLine());
        int c = Integer.parseInt(input.nextLine());
        int[][] first = new int[r][c];
        for (int rows = 0; rows < r; rows++) {
            for (int cols = 0; cols < c; cols++) {
                first[rows][cols] = Integer.parseInt(input.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(first));

    }
}