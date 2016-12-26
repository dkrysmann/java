import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int oddSum = 0;
        int evenSum = 0;
        for (int evenNum = 1; evenNum <=n ; evenNum++) {
            int num = Integer.parseInt(console.nextLine());
            if(evenNum % 2 == 0){
                evenSum+=num;
            }
            else{
                oddSum+=num;
            }
        }
        if(evenSum == oddSum){
            System.out.println("Yes");
            System.out.printf("Sum = %d",evenSum);
        }
        else{
            int absSum = Math.abs(evenSum-oddSum);
            System.out.println("No");
            System.out.printf("Diff = %d",absSum);
        }
    }
}
