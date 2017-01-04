import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        int firstDigit = num / 100;
        int secondDigit = num / 10 % 10;
        int thirdDigit = num % 10;
        int rows = firstDigit + secondDigit;
        int cols = firstDigit + thirdDigit;
        for (int i = 0; i < rows; i++) {
            for (int col = 0; col < cols; col++) {
                if(num % 5 == 0){
                    num -= firstDigit;
                }
                else if(num % 3 == 0){
                    num -= secondDigit;
                }
                else {
                    num += thirdDigit;
                }
                System.out.print(num  + " ");
            }
            System.out.println();
        }
    }
}
