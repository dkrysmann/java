import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher("aaaab");
        int counter = 0;
        while (matcher.find()){
            counter++;
        }
        System.out.println("Matches a->" + counter);
    }
}
