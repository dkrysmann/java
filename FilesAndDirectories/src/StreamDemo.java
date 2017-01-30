import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StreamDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String path = "D:\\test.txt";
        try(FileInputStream fis = new FileInputStream(path)){
            int oneByte = fis.read();
            while (oneByte>=0){
                System.out.println(oneByte);
                oneByte = fis.read();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
