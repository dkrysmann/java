import java.util.Scanner;

public class minNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= a ; i++) {
            int input = Integer.parseInt(console.nextLine());
            if(input < min){
                min = input;
            }
        }
        System.out.println(min);
    }
}
