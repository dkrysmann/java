import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class SumNums {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(", ");
        Function<String, Integer> parser = num -> Integer.parseInt(num);
        int sumAllNumbers = 0;
        for (String s : input) {
            sumAllNumbers+=parser.apply(s);
        }
        System.out.printf("Count = %s%n",input.length);
        System.out.printf("Sum = %d",sumAllNumbers);
    }
}
