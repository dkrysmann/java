import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class FindAndSumIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> numbers = Arrays.asList(reader.readLine().split(" "));
      //  OptionalInt result = numbers.stream().filter(x->)
    }
    public static boolean isNumber(String checker){
        if (checker.isEmpty()){
            return false;
        }else{
            for (char c : checker.toCharArray()) {
                if(!Character.isDigit(c)){
                    return false;
                }
            }
            return true;
        }
    }
}
