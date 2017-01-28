import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduationSecondTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(input.nextLine());
        String nameOfStudent = " ";
        TreeMap<String,Double> graduatedResult = new TreeMap<>();
        for (int i = 0; i < numberOfStudents; i++) {
            nameOfStudent = input.nextLine();
            String[] scores = input.nextLine().split(" ");
            double averageScores = 0;
            for (int j = 0; j < scores.length; j++) {
                String scoresStudent = scores[j];
                averageScores+=Double.parseDouble(scoresStudent);
            }
            double totalScores = (averageScores/scores.length);
            graduatedResult.put(nameOfStudent,totalScores);
        }
        for (String s : graduatedResult.keySet()) {
            System.out.println(s + " is graduated with " + graduatedResult.get(s));
        }
    }
}
