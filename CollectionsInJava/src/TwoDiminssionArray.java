import java.util.Scanner;
import java.util.Arrays;
public class TwoDiminssionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter rows:%n");
        int rows = Integer.parseInt(input.nextLine());
        System.out.printf("Enter cols:%n");
        int cols = Integer.parseInt(input.nextLine());
        System.out.printf("%d X %d%n",rows,cols);
        int[][] twoDim = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoDim[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(twoDim));
    }
}
