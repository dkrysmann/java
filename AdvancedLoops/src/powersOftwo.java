import java.util.Scanner;

public class powersOftwo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        powerBytwo(n);
    }
    static void powerBytwo(int cout){
        int num = 1;
        for (int i = 0; i <= cout; i++) {
            System.out.println(num);
            num = num * 2;
        }
    }
}
