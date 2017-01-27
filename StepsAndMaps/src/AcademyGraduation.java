import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        TreeMap<String,Double> result = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String inputName = input.nextLine();
            String[] scores = input.nextLine().split(" ");
            double totalScores = 0;
            for (String score : scores) {
                totalScores += Double.parseDouble(score);
            }
            result.put(inputName,(totalScores/scores.length));
        }
        for (String s : result.keySet()) {
            System.out.println(s + " is graduated with " + result.get(s));
        }
    }
}
