import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rowsAndcols = Integer.parseInt(input.nextLine());
        int[][] size = new int[rowsAndcols][rowsAndcols];
        int currentNum = 1;
        for (int col = 0; col < rowsAndcols; col++) {
            if(col%2 == 0){
                for (int row = 0; row < rowsAndcols; row++) {
                    size[col][row] = currentNum;
                    currentNum++;
                }
            }
            else{
                for (int row = rowsAndcols-1; row >= 0; row--) {
                    size[col][row] = currentNum;
                    currentNum++;
                }
            }
        }
        for (int row = 0; row < rowsAndcols; row++) {
            for (int col = 0; col < rowsAndcols; col++) {
                System.out.print(size[col][row] + " ");
            }
            System.out.println();
        }

    }

    }
