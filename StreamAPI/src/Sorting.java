import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String[] inputNumbers = reader.readLine().split(" ");
       List<Integer> container = new ArrayList<>();
        for (int i = 0; i < inputNumbers.length; i++) {
           container.add(Integer.parseInt(inputNumbers[i]));
       }
        container.stream().sorted((x1,x2) -> Integer.compare(x2,x1)).forEach(x -> System.out.print(x + " "));
        System.out.println();
        container.stream().sorted((y1,y2) -> Integer.compare(y1,y2)).forEach(y -> System.out.print(y + " "));
    }
}
