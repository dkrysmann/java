import java.text.DecimalFormat;
import java.util.Scanner;

public class vegetableMarket {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double oneEuro = 1.94;
        double vegetableKGprice = Double.parseDouble(console.nextLine());
        double fruitKGprice = Double.parseDouble(console.nextLine());
        double amountOfVegetable = Double.parseDouble(console.nextLine());
        double amountOfFruits = Double.parseDouble(console.nextLine());
        double totalPriceOfVegetable = vegetableKGprice * amountOfVegetable;
        double totalPriceOfFruits = fruitKGprice * amountOfFruits;
        double totalPrice = (totalPriceOfVegetable + totalPriceOfFruits) / oneEuro;
        DecimalFormat formater = new DecimalFormat("#.#############");
        System.out.println(formater.format(totalPrice));
    }
}
