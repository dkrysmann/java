import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class shockwave {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] matrixSize = reader.readLine().split(" ");
        int n = Integer.parseInt(matrixSize[0]);
       int m = Integer.parseInt(matrixSize[1]);
       Integer[][] matrix = new Integer[n][m];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                matrix[row][col] = 0;
            }
        }
        String commandInput = reader.readLine();
        while (!commandInput.equals("Here We Go")){
            String[] tokens = commandInput.split(" ");
            int x1 = Integer.parseInt(tokens[0]);
            int y1 = Integer.parseInt(tokens[1]);
            int x2 = Integer.parseInt(tokens[2]);
            int y2 = Integer.parseInt(tokens[3]);
            for (int row = x1; row <= x2; x1++) {
                for (int col = y1; col <= y2; col++) {
                    matrix[row][col] += 1;
                }
            }
            commandInput = reader.readLine();
        }
        for (Integer[] integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
