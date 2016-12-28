import java.util.Scanner;

public class reverseOrder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        reversedNums(n);
    }
    static void reversedNums(int count){
        for (int i = count; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
