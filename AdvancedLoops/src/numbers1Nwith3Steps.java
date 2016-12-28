import java.util.Scanner;

public class numbers1Nwith3Steps {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        step(n);
    }
    static void step(int count){
        for (int i = 1; i <= count ; i+=3) {
            System.out.println(i);
        }
    }
}
