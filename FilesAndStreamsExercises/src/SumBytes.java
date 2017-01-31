import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SumBytes {
    public static void main(String[] args) {
        String inputFilePath = null;
        File inputFile = null;
        BigInteger sum = BigInteger.ZERO;

        System.out.println("Enter path to file: ");

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            inputFilePath = console.readLine();
            inputFile = new File(inputFilePath);

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
                long code = reader.read();
                while (code != -1) {
                    sum = sum.add(BigInteger.valueOf(code));
                    code = reader.read();
                }
                System.out.println(sum);
            } catch (Exception e) {
                System.out.println("[!] Very descriptive critical error message [!]");
            }

        } catch (Exception e) {
            System.out.println("[!] Very descriptive critical error message [!]");
        }
    }
}
