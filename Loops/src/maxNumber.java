import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <=n ; i++) {
            int input = Integer.parseInt(console.nextLine());
            if(input > max){
                max = input;
            }
        }
        System.out.println(max);
    }
}
