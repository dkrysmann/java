import java.util.Scanner;

public class leftAndRightSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int a = 1;a<=number;a++){
            int input = Integer.parseInt(console.nextLine());
            leftSum += input;
        }
        for(int a = 1;a <= number;a++){
            int input = Integer.parseInt(console.nextLine());
            rightSum += input;
        }
        int absSum = Math.abs(leftSum-rightSum);
        if(absSum == 0){
            System.out.printf("Yes, sum = %d",rightSum);
        }
        else{
            System.out.printf("No, diff = %d",absSum);
        }

    }
}
