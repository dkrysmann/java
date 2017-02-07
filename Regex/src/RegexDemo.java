import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher("aaaab");
        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
