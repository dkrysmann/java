import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class MinEvenNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> numbers = Arrays.asList(reader.readLine().split(" "));
        OptionalDouble result = numbers.stream().filter(x->!x.isEmpty())
                .mapToDouble(x->Double.parseDouble(x)).filter(x -> x%2 == 0).min();
        if(result.isPresent()){
            System.out.printf("%.2f",result.getAsDouble());
        }else{
            System.out.println("No match");
        }
    }
}
