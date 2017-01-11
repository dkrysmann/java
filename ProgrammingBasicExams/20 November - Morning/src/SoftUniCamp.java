import java.util.Scanner;

public class SoftUniCamp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double groups = Double.parseDouble(input.nextLine());
        double car = 0;
        double bus = 0;
        double smallBus = 0;
        double bigBus = 0;
        double train = 0;
        double allStudents = 0;
        for (int i = 0; i < groups; i++) {
            double number = Double.parseDouble(input.nextLine());
            if(number <= 5){
                car+=number;
            }
            else if(number >= 6 && number <= 12){
                bus+= number;
            }
            else if(number>=13 && number <= 25){
                smallBus += number;
            }
            else if(number >= 26 && number <= 40){
                bigBus+=number;
            }
            else if(number >= 41){
                train+=number;
            }
            allStudents+=number;
        }
        double studentsInCar = (car * 100) / allStudents;
        double studentsInBus = (bus * 100) / allStudents;
        double studentsInSmallBus = (smallBus * 100) / allStudents;
        double studentsInBigBus = (bigBus * 100) / allStudents;
        double studentsInTrain = (train * 100) / allStudents;
        System.out.printf("%.2f%%%n",studentsInCar);
        System.out.printf("%.2f%%%n",studentsInBus);
        System.out.printf("%.2f%%%n",studentsInSmallBus);
        System.out.printf("%.2f%%%n",studentsInBigBus);
        System.out.printf("%.2f%%%n",studentsInTrain);
    }
}
