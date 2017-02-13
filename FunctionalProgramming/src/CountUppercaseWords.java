import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\+s");
        Predicate<String> uppercaseChecker = upper -> Character.isUpperCase(upper.charAt(0));
        StringBuilder builder = new StringBuilder();
            int counter = 0;
        for (String s : input) {
            if(uppercaseChecker.test(s)){
                counter++;
                builder.append(s).append(System.lineSeparator());
            }
        }
        System.out.println(counter);
        System.out.printf("%s",builder);
    }
}