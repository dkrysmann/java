import java.util.Scanner;

public class smallShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String article = console.nextLine();
        String town = console.nextLine();
        double quantity = Double.parseDouble(console.nextLine());

        if (town.equals("Sofia")) {
            if (article.equals("coffee")) {
                double priceOfcaffee = quantity * 0.50;
                System.out.println(priceOfcaffee);
            } else if (article.equals("water")) {
                double priceOfWater = quantity * 0.80;
                System.out.println(priceOfWater);
            } else if (article.equals("beer")) {
                double priceOfBeer = quantity * 1.20;
                System.out.println(priceOfBeer);
            } else if (article.equals("sweets")) {
                double priceOfSweets = quantity * 1.45;
                System.out.println(priceOfSweets);
            } else if (article.equals("peanuts")) {
                double priceOfPeanuts = quantity * 1.60;
                System.out.println(priceOfPeanuts);
            }
        }
        if(town.equals("Plovdiv")){
            if(article.equals("coffee")){
                double cofeePrice = quantity * 0.40;
                System.out.println(cofeePrice);
            }
            else if(article.equals("water")){
                double priceOfwater = quantity * 0.70;
                System.out.println(priceOfwater);
            }
            else if(article.equals("beer")){
                double priceOfbeer = quantity * 1.15;
                System.out.println(priceOfbeer);
            }
            else if(article.equals("sweets")){
                double priceOfSweets = quantity * 1.30;
                System.out.println(priceOfSweets);
            }
            else if(article.equals("peanuts")){
                double priceOfPeanuts = quantity * 1.50;
                System.out.println(priceOfPeanuts);
            }
        }
        if(town.equals("Varna")){
            if(article.equals("coffee")){
                double priceOfCaffee = quantity * 0.45;
                System.out.println(priceOfCaffee);
            }
            else if(article.equals("water")){
                double priceOfWater = quantity * 0.70;
                System.out.println(priceOfWater);
            }
            else if(article.equals("beer")){
                double priceOfBeer = quantity * 1.10;
                System.out.println(priceOfBeer);
            }
            else if(article.equals("sweets")){
                double priceOfSweets = quantity * 1.35;
                System.out.println(priceOfSweets);
            }
            else if(article.equals("peanuts")){
                double priceOfPeanuts = quantity * 1.55;
                System.out.println(priceOfPeanuts);
            }
        }
    }
}