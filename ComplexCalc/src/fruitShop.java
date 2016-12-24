import java.util.Scanner;

public class fruitShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String fruit = console.nextLine();
        String dayOfweek = console.nextLine();
        double quantity = Double.parseDouble(console.nextLine());
        if(dayOfweek.equals("Monday") || dayOfweek.equals("Tuesday") || dayOfweek.equals("Wednesday") ||
                dayOfweek.equals("Thursday") || dayOfweek.equals("Friday")){
            if(fruit.equals("banana")){
                double bananaPrice = quantity * 2.50;
                System.out.printf("%.2f",bananaPrice);
            }
            else if(fruit.equals("apple")){
                double applePrice = quantity * 1.20;
                System.out.printf("%.2f",applePrice);
            }
            else if(fruit.equals("orange")){
                double orangePrice = quantity * 0.85;
                System.out.printf("%.2f",orangePrice);
            }
            else if(fruit.equals("grapefruit")){
                double grPrice = quantity * 1.45;
                System.out.printf("%.2f",grPrice);
            }
            else if(fruit.equals("kiwi")){
                double kiwiPrice = quantity * 2.70;
                System.out.printf("%.2f",kiwiPrice);
            }
            else if(fruit.equals("pineapple")){
                double pinePrice = quantity * 5.50;
                System.out.printf("%.2f",pinePrice);
            }
            else if(fruit.equals("grapes")){
                double grapesPrice = quantity * 3.85;
                System.out.printf("%.2f",grapesPrice);
            }
            else{
                System.out.println("error");
            }
        }
        else if(dayOfweek.equals("Sunday") || dayOfweek.equals("Saturday")){
            if(fruit.equals("banana")){
                double bananaPrice = quantity * 2.70;
                System.out.printf("%.2f",bananaPrice);
            }
            else if(fruit.equals("apple")){
                double applePrice = quantity * 1.25;
                System.out.printf("%.2f",applePrice);
            }
            else if(fruit.equals("orange")){
                double orangePrice = quantity * 0.90;
                System.out.printf("%.2f",orangePrice);
            }
            else if(fruit.equals("grapefruit")){
                double grPrice = quantity * 1.60;
                System.out.printf("%.2f",grPrice);
            }
            else if(fruit.equals("kiwi")){
                double kiwiPrice = quantity * 3.00;
                System.out.printf("%.2f",kiwiPrice);
            }
            else if(fruit.equals("pineapple")){
                double pineapple = quantity * 5.60;
                System.out.printf("%.2f",pineapple);
            }
            else if(fruit.equals("grapes")){
                double grapesPrice = quantity * 4.20;
                System.out.printf("%.2f",grapesPrice);
            }
            else{
                System.out.println("error");
            }
        }
        else{
            System.out.println("error");
        }

    }
}
