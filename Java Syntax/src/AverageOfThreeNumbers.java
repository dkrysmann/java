import java.util.Scanner;


public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numOne = input.nextDouble();
        double numTwo = input.nextDouble();
        double numThree = input.nextDouble();
        result(numOne,numTwo,numThree);
    }
    public static double result(double num1,double num2,double num3){
       double average = (num1 + num2 + num3) / 3;
        System.out.printf("%.2f",average);
        return average;
    }
}
