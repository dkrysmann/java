package MathPow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double num = Double.parseDouble(reader.readLine());
        double num1 = Double.parseDouble(reader.readLine());
        double res = baseToPower(num,num1);
        System.out.printf("%.0f",res);
    }
     static double baseToPower(double num,double num1){
        return Math.pow(num,num1);
    }
}
