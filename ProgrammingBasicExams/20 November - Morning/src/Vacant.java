import java.util.Scanner;

public class Vacant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double old = Double.parseDouble(input.nextLine());
        double young = Double.parseDouble(input.nextLine());
        double days = Double.parseDouble(input.nextLine());
        String transportType = input.nextLine().toLowerCase();
        double oneNight = 82.99;
        double priceForOld = 0;
        double priceForYoung = 0;
        double totalPrice = 0;
        if(transportType.equals("airplane")){
            priceForOld = 70.00;
            priceForYoung = 50.00;
            double transport = ((old * priceForOld) + (young * priceForYoung)) * 2;
            double hotel = days * oneNight;
            double commission = (transport + hotel) * 0.10;
             totalPrice = transport + hotel + commission;

        }
        else if(transportType.equals("train")){
            double allPasangers = old + young;
            priceForOld = 24.99;
            priceForYoung = 14.99;
            if(allPasangers >= 50){
                priceForOld = (priceForOld / 100) * 50;
                priceForYoung = (priceForYoung / 100) * 50;
                double transport = ((old * priceForOld) + (young * priceForYoung)) * 2;
                double hotel = days * oneNight;
                double commission = (transport + hotel) * 0.10;
                 totalPrice = (transport + hotel + commission);

            }
            else{
                priceForOld = 24.99;
                priceForYoung = 14.99;
                double transport = ((old * priceForOld) + (young * priceForYoung)) * 2;
                double hotel = days * oneNight;
                double commission = (transport + hotel) * 0.10;
                 totalPrice = (transport + hotel + commission);
            }
        }
        else if(transportType.equals("boat")){
            priceForOld = 42.99;
            priceForYoung = 39.99;
            double transport = ((old * priceForOld) + (young * priceForYoung)) * 2;
            double hotel = days * oneNight;
            double commission = (transport + hotel) * 0.10;
             totalPrice = (transport + hotel + commission);
        }
        else{
            priceForOld = 32.50;
            priceForYoung = 28.50;
            double transport = ((old * priceForOld) + (young * priceForYoung)) * 2;
            double hotel = days * oneNight;
            double commission = (transport + hotel) * 0.10;
             totalPrice = (transport + hotel + commission);
        }
        System.out.printf("%.2f",totalPrice);
    }
}
