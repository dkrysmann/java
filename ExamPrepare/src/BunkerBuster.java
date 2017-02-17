import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BunkerBuster {
    private static Integer[][] matrix;
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] matrixSize = input.readLine().split("\\s+");
        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);
        matrix = new Integer[rows][cols];
        readMatrix(input);
        String commandInput = input.readLine();
        while (!commandInput.equals("cease fire!")){
            String[] tokens = commandInput.split("\\s+");
            int impactRow = Integer.parseInt(tokens[0]);
            int impactCol = Integer.parseInt(tokens[1]);
            String damage = tokens[2];
            commandExecute(impactRow,impactCol,damage);

            commandInput = input.readLine();
        }
        int cellDestroyed = findDestroyedCell();
        System.out.println("Destroyed bunkers:" + cellDestroyed);
        Double percent =100.0 * cellDestroyed / (rows*cols);
        System.out.printf("Damage done: %.1f",percent);

    }

    private static int findDestroyedCell() {
        int counter = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if(matrix[row][col] <= 0){
                    counter+=1;
                }
            }
        }
        return counter;
    }


    public static void commandExecute(int impactRow, int impactCol, String damage) {
        try {
            int damageCost = (int)damage.charAt(0);
            cellDamage(impactRow,impactCol,damageCost);
            if(damageCost%2 !=0){
                damageCost = damageCost/2+1;
            }else{
                damageCost/=2;
            }
            cellDamage(impactRow,impactCol+1,damageCost);
            cellDamage(impactRow+1,impactCol+1,damageCost);
            cellDamage(impactRow+1,impactCol,damageCost);
            cellDamage(impactRow+1,impactCol-1,damageCost);
            cellDamage(impactRow,impactCol-1,damageCost);
            cellDamage(impactRow-1,impactCol-1,damageCost);
            cellDamage(impactRow-1,impactCol,damageCost);
            cellDamage(impactRow-1,impactCol+1,damageCost);

        }catch (IndexOutOfBoundsException ex){

        }
    }

    private static void cellDamage(int impactRow, int impactCol, int damageCost) {
        matrix[impactRow][impactCol]=-damageCost;

    }

    public static void readMatrix(BufferedReader reader) throws IOException {
        for (int row = 0; row < matrix.length; row++) {
            String[] reminder = reader.readLine().split("\\s+");
            for (int col = 0; col < reminder.length; col++) {
                matrix[row][col] = Integer.parseInt(reminder[col]);
            }
        }
    }
}
