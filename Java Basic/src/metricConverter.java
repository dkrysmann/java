import java.text.DecimalFormat;
import java.util.Scanner;

public class metricConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inputMetric = Double.parseDouble(input.nextLine());
        String inputSource = input.nextLine().toLowerCase();
        String outputSource = input.nextLine().toLowerCase();
        double mm = 1000;
        double cm = 100;
        double mi = 0.000621371192;
        double in = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;
        if(inputSource.equals("mm")){
            inputMetric /= mm;
        }
        else if(inputSource.equals("cm")){
            inputMetric /= cm;
        }
        else if(inputSource.equals("mi")){
            inputMetric /= mi;
        }
        else if(inputSource.equals("in")){
            inputMetric /= in;
        }
        else if(inputSource.equals("km")){
            inputMetric /= km;
        }
        else if(inputSource.equals("ft")){
            inputMetric /= ft;
        }
        else if(inputSource.equals("yd")){
            inputMetric /= yd;
        }

        if(outputSource.equals("mm")){
            inputMetric *= mm;

        }
        else if(outputSource.equals("cm")){
            inputMetric *= cm;
        }
        else if(outputSource.equals("mi")){
            inputMetric *= mi;
        }
        else if(outputSource.equals("in")){
            inputMetric *= in;
        }
        else if(outputSource.equals("km")){
            inputMetric *= km;
        }
        else if(outputSource.equals("ft")){
            inputMetric *= ft;
        }
        else if(outputSource.equals("yd")){
            inputMetric *= yd;
        }
        DecimalFormat df = new DecimalFormat("########.#######");
        System.out.printf(df.format(inputMetric));
    }
}
