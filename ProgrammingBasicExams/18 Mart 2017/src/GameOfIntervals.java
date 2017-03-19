import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameOfIntervals {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputNumber = Integer.parseInt(reader.readLine());
        int from0to9 = 0;
        int from10to19 = 0;
        int from20to29 = 0;
        int from30to39 = 0;
        int from40to50 = 0;
        int ivalidNum = 0;
        int totalResult = 0;

        for (int i = 0; i < inputNumber; i++) {
            int newNumber = Integer.parseInt(reader.readLine());
            if(newNumber >=0 && newNumber <= 9){
                from0to9++;
            }else if(newNumber >= 10 && newNumber <=19){
                from10to19++;
            }else if(newNumber >= 20 && newNumber>=29){
                totalResult = totalResult + (23/100)*40;
                from20to29++;
            }else if(newNumber >= 30 && newNumber <= 39){
                from30to39++;
            }else if(newNumber >=40 && newNumber <= 50){
                from40to50++;
                totalResult+=100;
            }else if(newNumber >= 57){
                ivalidNum++;
                ivalidNum+=100 / 2;
            }
        }
        double zeroTo9 = (from0to9 * 100) / inputNumber;
        double tenTo19 = (from10to19 * 100) / inputNumber;
        double twentyTo29 = (from20to29 * 100) / inputNumber;
        double thirtyTo39 = (from30to39 * 100) / inputNumber;
        double fourtyTo50 = (from40to50 * 100) / inputNumber;
        double average = totalResult / inputNumber;
        System.out.printf("%.2f",average);
        System.out.println();
        System.out.printf("From 0 to 9: %.2f%%%n",zeroTo9);
        System.out.printf("From 10 to 19: %.2f%%",tenTo19);
    }
}
