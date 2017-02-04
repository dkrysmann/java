import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseTags {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String upCase = "<upcase>";
        String upCaseClosed = "</upcase>";
        while (input.contains(upCase)){
            int indexOfStart = input.indexOf(upCase);
            int indexOfEnd = input.indexOf(upCaseClosed);
            String reminder = input.substring(indexOfStart+upCase.length(),indexOfEnd);
           input = input.replace(upCase + reminder + upCaseClosed,reminder.toUpperCase());
        }
        System.out.println(input);
    }
}
