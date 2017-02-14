import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class AverageOfDoubles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> numbers = Arrays.asList(reader.readLine().split("\\s+"));
        DoubleStream stream = numbers.stream().filter(x->!x.isEmpty()).mapToDouble(n -> Double.valueOf(n));
       OptionalDouble result = stream.average();
       if(result.isPresent()){
           System.out.printf("%.2f",result.getAsDouble());
       }else{
           System.out.println("No match");
       }
    }
}