import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firsInput = input.next("\\w+");
        String secondInput = input.next("\\w+");
        int fitsNum = Integer.parseInt(input.next());
        int secondNum = Integer.parseInt(input.next());
        int thirdNum = Integer.parseInt(input.next());
        int totalSum = fitsNum + secondNum + thirdNum;
        input.nextLine();
        String thirdInput = input.nextLine();
        System.out.printf("%s %s %s %d",firsInput,secondInput,thirdInput,totalSum);
    }
}
