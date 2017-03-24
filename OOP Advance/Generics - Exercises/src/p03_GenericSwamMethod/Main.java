package p03_GenericSwamMethod;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(reader.readLine());
            list.add(number);
        }
        String[] input = reader.readLine().split("\\s+");
        int a = list.get(Integer.parseInt(input[0]));
        list.set(Integer.parseInt(input[0]),list.get(Integer.parseInt(input[1])));
        list.set(Integer.parseInt(input[1]),a);
        for (int s : list) {
            System.out.println(new Swap<>(s));
        }
    }
}
