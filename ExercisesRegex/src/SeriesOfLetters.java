import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeriesOfLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = reader.readLine();
        Pattern paternSearch = Pattern.compile("([a-z-A-Z])\\1+");
        Matcher paternMach = paternSearch.matcher(inputText);
        while(paternMach.find()){
           inputText = paternMach.replaceAll("$1");
        }
        System.out.println(inputText);
    }
}
