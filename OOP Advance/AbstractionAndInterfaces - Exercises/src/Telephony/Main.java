package Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().split("\\s+");
        String[] webAdress = reader.readLine().split("\\s+");
        Smartphone smartphone = new Smartphone();
        StringBuilder builder = new StringBuilder();
        for (String num : numbers) {
            builder.append(smartphone.makeCall(num)).append(System.lineSeparator());
        }
        for (String webAdres : webAdress) {
            builder.append(smartphone.startBrowse(webAdres)).append(System.lineSeparator());
        }
        System.out.println(builder);
    }
}
