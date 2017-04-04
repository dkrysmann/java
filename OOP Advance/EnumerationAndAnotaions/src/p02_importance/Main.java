package p02_importance;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String level = reader.readLine();
        Logger logger = new Logger(Importance.valueOf(level));
        String commandInput = reader.readLine();
        while (!commandInput.equals("END")){
            String[] msgLevel = commandInput.split(":");
            commandInput = reader.readLine();
        }
    }
}
