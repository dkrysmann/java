import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = reader.readLine();
        Pattern serchPatern = Pattern.compile("^[A-Z][a-z]+ [A-Z][a-z]+$");
        while (!inputText.equals("end")){
            Matcher matcPatern = serchPatern.matcher(inputText);
            if(matcPatern.find()){
                System.out.println(inputText);
            }
            inputText = reader.readLine();
        }
    }
}
