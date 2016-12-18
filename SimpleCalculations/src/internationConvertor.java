import java.util.Scanner;

public class internationConvertor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double sum = Double.parseDouble(console.nextLine());
        double oneUSD = 1.79549;
        double oneEuro = 1.95583;
        double GBP = 2.53405;
        String currencyInput = console.nextLine();
        String currencyOutput = console.nextLine();
        if(currencyInput.equals("USD") && currencyOutput.equals("BGN")){
            double res = sum * oneUSD;
            System.out.printf("%.2f",res);
        }
       else if(currencyInput.equals("BGN") && currencyOutput.equals("EUR")){
            double res = sum / oneEuro;
            System.out.printf("%.2f",res);
        }
        else if(currencyInput.equals("EUR") && currencyOutput.equals("GBP")){
           double res = (sum * oneEuro) / GBP;
            System.out.printf("%.2f",res);
        }
        else if(currencyInput.equals("USD") && currencyOutput.equals("EUR")){
            double res = (sum * oneUSD) / oneEuro;
            System.out.printf("%.2f",res);
        }
        else if(currencyInput.equals("GBP") && currencyOutput.equals("USD")){
            double res = (sum * GBP) / oneUSD;
            System.out.printf("%.2f",res);
        }

    }

}
