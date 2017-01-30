import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) {
        String inputPath = "D:\\input.txt";
        String outPuth = "D:\\outputhPath.txt";
        try(Scanner input = new Scanner(new FileInputStream(inputPath));
            PrintWriter writer = new PrintWriter(outPuth)){
            while (input.hasNext()){
                if(input.hasNextInt()){
                    writer.println(input.nextInt());
                }
                input.next();
            }
        }catch (IOException excp){
            excp.printStackTrace();
        }
    }
}
