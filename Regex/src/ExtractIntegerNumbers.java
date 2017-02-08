import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractIntegerNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        Pattern searchPatern = Pattern.compile("\\d+");
        Matcher paternMach = searchPatern.matcher(text);
        while (paternMach.find()){
            System.out.println(paternMach.group());
        }
    }
}
