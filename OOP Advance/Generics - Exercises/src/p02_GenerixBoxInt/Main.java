package p02_GenerixBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numbers = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numbers; i++) {
            BoxInt<Integer> boxInt = new BoxInt<>(Integer.parseInt(reader.readLine()));
            System.out.println(boxInt.toString());
        }
    }
}
