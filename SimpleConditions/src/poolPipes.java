import java.util.Scanner;

public class poolPipes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double v = Double.parseDouble(console.nextLine());
        double p1 = Double.parseDouble(console.nextLine());
        double p2 = Double.parseDouble(console.nextLine());
        double hours = Double.parseDouble(console.nextLine());
        double waterDebit = (p1 * hours + p2 * hours);
        if(waterDebit <= v){
            double poolVolumewithWater = (int)(waterDebit / v * 100);
            double firstPipe = (int)(p1 * hours / waterDebit * 100);
            double secondPipe = (int)(p2 * hours / waterDebit * 100);
            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.",poolVolumewithWater,firstPipe,secondPipe);
        }
        else {
            System.out.printf("For %s hours the pool overflows with %.0f liters.",hours,waterDebit-v);
        }
    }
}
