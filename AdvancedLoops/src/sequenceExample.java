import java.util.Scanner;

public class sequenceExample {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        simpleSequence(n);
    }
    static void simpleSequence(int count){
        int num = 1;
        while (num <= count){
            System.out.println(num);
            num = num * 2 + 1;
        }
    }
}
