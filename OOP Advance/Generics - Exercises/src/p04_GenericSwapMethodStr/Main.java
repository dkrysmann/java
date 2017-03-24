package p04_GenericSwapMethodStr;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String names = reader.readLine();
            list.add(names);
        }
        String[] swapElements = reader.readLine().split("\\s+");
        String a = list.get(Integer.parseInt(swapElements[0]));
        list.set(Integer.parseInt(swapElements[0]),list.get(Integer.parseInt(swapElements[1])));
        list.set(Integer.parseInt(swapElements[1]),a);
        for (String s : list) {
            System.out.println(new SwapString<>(s));
        }
    }
}
