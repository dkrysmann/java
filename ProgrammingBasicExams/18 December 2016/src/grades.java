import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double students = Double.parseDouble(input.nextLine());
        double best = 0;
        double better = 0;
        double good = 0;
        double fail = 0;
        double average = 0;
        for (int i = 0; i < students; i++) {
            double inputGrade = Double.parseDouble(input.nextLine());
            if(inputGrade >= 5){
                best++;
            }
            else if(inputGrade >= 4 && inputGrade <= 4.99){
                better++;
            }
            else if(inputGrade >= 3 && inputGrade <= 3.99){
                good++;
            }
            else{
                fail++;
            }
            average += inputGrade;
        }
        double bestGrade = (best * 100) / students;
        double betterGrade = (better * 100) / students;
        double goodGrade = (good * 100) / students;
        double weakGrade = (fail * 100) / students;
        double averageGrades = average / students;
        System.out.printf("Top students: %.2f%%%n",bestGrade);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",betterGrade);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",goodGrade);
        System.out.printf("Fail: %.2f%%%n",weakGrade);
        System.out.printf("Average: %.2f",averageGrades);
    }

}
