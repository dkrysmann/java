import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dogHouse {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double lenghtA = Double.parseDouble(reader.readLine());
        double hightB = Double.parseDouble(reader.readLine());
        double twoSides = lenghtA * (lenghtA / 2) * 2;
        double square = (lenghtA / 2) * (lenghtA / 2);
        double triangle = (lenghtA / 2 * (hightB - lenghtA / 2)) / 2;
        double backSide = square + triangle;
        double in = (lenghtA / 5) * (lenghtA / 5);
       // double inTot = in * 1.2;
        double frontSide = backSide - in;
        double totalSize = twoSides + backSide + frontSide;
        double green = totalSize / 3;
        double roof = lenghtA * (lenghtA / 2) * 2;
        double red = roof / 5;
        System.out.printf("%.2f",green);
        System.out.println();
       // System.out.println(String.format("%f.2f",red));
        System.out.printf("%.2f",red);
    }
}
