import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String typeOfProjection = console.nextLine();
        double r = Double.parseDouble(console.nextLine());
        double c = Double.parseDouble(console.nextLine());
        String lv = "leva";
        switch (typeOfProjection){
            case "Premiere":
                double profit = r * c * 12.00;
                System.out.printf("%.2f %s",profit,lv);
                break;
            case "Normal":
                double profit1 = r * c * 7.50;
                System.out.printf("%.2f %s",profit1,lv);
                break;
            case "Discount":
                double profit2 = r * c * 5.00;
                System.out.printf("%.2f %s",profit2,lv);
                break;
                default:
                    break;
        }
    }
}
