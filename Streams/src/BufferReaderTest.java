import java.io.*;

public class BufferReaderTest {
    public static void main(String[] args) {
      try(BufferedReader reader = new BufferedReader(new FileReader("text.txt"))){
          System.out.println(reader.readLine());
          System.out.println(reader.readLine());
          System.out.println(reader.readLine());
      }catch (IOException exc){
          System.out.println("Coughed");
      }
    }
}
