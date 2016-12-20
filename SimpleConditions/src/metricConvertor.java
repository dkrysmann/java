import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class metricConvertor {
    //0.0932056788
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double size = Double.parseDouble(console.nextLine());
        String inputSource = console.nextLine().toLowerCase();
        String outputSource = console.nextLine().toLowerCase();
        double mm = 1000;
        double cm = 100;
        double mi = 0.000621371192;
        double in = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;
        if(inputSource.equals("km") && outputSource.equals("ft")){
            size = (size / km) * ft;
            System.out.println(size + " ft");
        }
        else if(inputSource.equals("mi") && outputSource.equals("in")){
            size = (size / mi) * in;
            String value = String.valueOf(size);
            System.out.println(value.substring(0,value.length()-1) + " mi");
        }
        else if(inputSource.equals("yd") && outputSource.equals("km")){
            size = (size / yd) * km;
            String value = String.valueOf(size);
            System.out.println(value.substring(0,value.length()-2) + " yd");
        }
    }
}
