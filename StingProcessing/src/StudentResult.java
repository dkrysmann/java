import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class StudentResult {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputNumbersOfStudents = Integer.parseInt(reader.readLine());
        TreeMap<String, List<Double>> result = new TreeMap<>();
        for (int i = 0; i < inputNumbersOfStudents; i++) {
            String[] input = reader.readLine().split(" - ");
            String[] exmaResults = input[1].split(",");

            List<Double> containerResults = new ArrayList<>();
            double sum = 0;
            for (String exmaResult : exmaResults) {
                double reminder = Double.parseDouble(exmaResult);
                sum += reminder;
                containerResults.add(reminder);
            }
            containerResults.add(sum / 3);
            result.put(input[0], containerResults);
        }
        if (inputNumbersOfStudents != 0) {
            System.out.println(String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|", "Name", "JAdv", "JavaOOP", "AdvOOP", "Average"));
            for (String s : result.keySet()) {
                System.out.println(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|",
                        s, result.get(s).get(0), result.get(s).get(1), result.get(s).get(2), result.get(s).get(3)).replace(".",
                        ","));
            }
        }
    }
}