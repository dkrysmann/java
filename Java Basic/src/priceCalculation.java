import java.util.Scanner;

public class priceCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Insert number of products: ");
        double n = Double.parseDouble(input.nextLine());
        double price = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Product number " + i);
            String products = input.nextLine();
            System.out.print(products + " price = ");
            double setPrice = Double.parseDouble(input.nextLine());
            price+=setPrice;
        }
        System.out.println("Total price: " + price);

    }
}
