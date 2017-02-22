import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class HighScore {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String command = " ";
       while (!"osu".equals(command = reader.readLine())){
           String[] data = command.split("<->");
           String opponent = data[0];
           String opponent1 = data[1];
       }
   }
}
