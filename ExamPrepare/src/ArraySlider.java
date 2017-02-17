import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.List;

public class ArraySlider {
  private static int currentIndex = 0;
    private static List<BigInteger> list;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        for (String s : input) {
            list.add(new BigInteger(s));
        }
        String command = reader.readLine();
        while (!command.equals("stop")){
            String[] reminder = command.trim().split("\\s+");
            int offset = Integer.valueOf(reminder[0]);
            String operation = reminder[1];
            BigInteger operand =new BigInteger(reminder[2]);
            command = reader.readLine();
            findIndex(offset);
            operationExecute(operation,operand);
        }

    }
    public static void findIndex(int offset){
       currentIndex =Math.abs((currentIndex+offset) % list.size());
        currentIndex+=offset;
        if(currentIndex >= list.size()){
            currentIndex %= list.size();
        }else if(currentIndex < 0){
            currentIndex = list.size() - 1 - Math.abs(currentIndex);
        }
    }
    public static void operationExecute(String operation, BigInteger operand){
        switch (operation){
            case "&":
                list.add(currentIndex, list.get(currentIndex).and(operand));
                break;
            case "|":
                list.add(currentIndex, list.get(currentIndex).and(operand));
                break;
            case "^":
                list.add(currentIndex, list.get(currentIndex).and(operand));
                break;
            case "+":
                list.add(currentIndex, list.get(currentIndex).and(operand));
                break;
            case "-":
                list.add(currentIndex, list.get(currentIndex).and(operand));
                break;
            case "*":
                list.add(currentIndex, list.get(currentIndex).and(operand));
                break;
            case "/":
                list.add(currentIndex, list.get(currentIndex).and(operand));
                break;
                default:
                    break;
        }
    }
}
