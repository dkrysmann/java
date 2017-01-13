import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        printRecursive(a);
    }
    public static void printRecursive(int n){
        if(n<1){
            return;
        }
        printRecursive(n-1);
        System.out.println(n);
    }
}
