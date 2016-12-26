import java.util.Scanner;

public class halfSumElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 0;
        int maxNumber = 0;
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(console.nextLine());
            if(input > maxNumber){
                maxNumber = input;
            }
            sum = sum + input;
        }
        sum = sum - maxNumber;
        if(sum == maxNumber){
            System.out.println("Yes");
            System.out.printf("Sum = %d",sum);
        }
        else{
            int difference = Math.abs(sum - maxNumber);
            System.out.println("No");
            System.out.printf("Diff = %d",difference);
        }
    }
}
