package SignOfInteger;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        printSign(n);
    }
    static void printSign(int n){
        if(n > 0){
            System.out.println("The number " + n + " " + "is " + "positive.");
        }else if (n < 0){
            System.out.println("The number " + n + " " + "is " + "negative.");
        }else{
            System.out.println("The number " + n + " " + "is " + "zero.");
        }
    }

}
