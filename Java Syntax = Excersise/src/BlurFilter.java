import java.util.Scanner;

public class BlurFilter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long filter = Long.parseLong(input.nextLine());
        String[] spliter = input.nextLine().split(" ");
        int rows = Integer.parseInt(spliter[0]);
        int cols = Integer.parseInt(spliter[1]);
        long[][] sizeOfPixels = new long[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] delimeter = input.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                sizeOfPixels[row][col] = Integer.parseInt(delimeter[col]);
            }
        }
        String[] coordinates = input.nextLine().split(" ");
        int targetRow = Integer.parseInt(coordinates[0]);
        int targetCol = Integer.parseInt(coordinates[1]);
        int leftCheck = Math.max(0,targetCol-1);
        int rightCheck = Math.min(targetCol+1,cols);
        int topCheck = Math.max(targetRow-1,0);
        int bottomCheck = Math.min(targetRow+1,rows);

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if((leftCheck <= col && col<= rightCheck) && (topCheck <= row && row <= bottomCheck)){
                    System.out.printf("%d ",sizeOfPixels[row][col] + filter);
                }else{
                    System.out.printf("%d ",sizeOfPixels[row][col]);
                }
            }
            System.out.println();
        }
    }
}
