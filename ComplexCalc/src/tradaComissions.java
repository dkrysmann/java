import java.util.Scanner;

public class tradaComissions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String town = console.nextLine();
        double sales = Double.parseDouble(console.nextLine());
        if(town.equals("Sofia")){
            if(sales >= 0 && sales <= 500){
                double result = (sales / 100 * 5);
                System.out.printf("%.2f",result);
            }
            else if(sales >= 500 && sales <= 1000){
                double result = (sales / 100 * 7);
                System.out.printf("%.2f",result);
            }
            else if(sales >= 1000 && sales <= 10000){
                double result = (sales / 100 * 8);
                System.out.printf("%.2f",result);
            }
            else if(sales > 10000){
                double result = (sales / 100 * 12);
                System.out.printf("%.2f",result);
            }
            else{
                System.out.printf("error");
            }
        }
       else if(town.equals("Varna")){
            if(sales >= 0 && sales <= 500){
                double result = (sales / 100 * 4.5);
                System.out.printf("%.2f",result);
            }
            else if(sales >= 500 && sales <= 1000){
                double result = (sales / 100 * 7.5);
                System.out.printf("%.2f",result);
            }
            else if(sales >= 1000 && sales <= 10000){
                double result = (sales / 100 * 10);
                System.out.printf("%.2f",result);
            }
            else if(sales > 10000){
                double result = (sales / 100 * 13);
                System.out.printf("%.2f",result);
            }
            else{
                System.out.printf("error");
            }
        }
       else if(town.equals("Plovdiv")){
            if(sales >= 0 && sales <= 500){
                double result = (sales / 100 * 5.5);
                System.out.printf("%.2f",result);
            }
            else if(sales >= 500 && sales <= 1000){
                double result = (sales / 100 * 8);
                System.out.printf("%.2f",result);
            }
            else if(sales >= 1000 && sales <= 10000){
                double result = (sales / 100 * 12);
                System.out.printf("%.2f",result);
            }
            else if(sales > 10000){
                double result = (sales / 100 * 14.5);
                System.out.printf("%.2f",result);
            }
            else{
                System.out.printf("error");
            }
        }
        else{
            System.out.printf("error");
        }
    }
}
