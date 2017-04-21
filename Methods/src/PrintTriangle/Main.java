package PrintTriangle;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double width = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());
       double area = getTriangleArea(width,height);
        System.out.println((int)area);
    }
    static double getTriangleArea(double width,double height){
       return (width * height)/2;
    }
}
