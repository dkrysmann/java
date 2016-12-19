import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double input = Double.parseDouble(console.nextLine());
        if(input % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }
}
