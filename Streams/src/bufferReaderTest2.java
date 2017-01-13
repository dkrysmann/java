import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferReaderTest2 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("text.txt"))){
            System.out.println(reader.readLine());

        }catch (IOException error){
            System.out.println("Error");
        }
    }
}
