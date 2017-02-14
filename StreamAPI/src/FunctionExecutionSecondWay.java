import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class FunctionExecutionSecondWay {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> result = Arrays.asList(reader.readLine().split("\\s+"));
        result.stream().map(x->Integer.valueOf(x)).distinct().filter(x->10 <= x && x <= 20)
                .limit(2).forEach(x-> System.out.println(x));
    }
}
