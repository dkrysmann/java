import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteLines {
    public static void main(String[] args) {
        String inputPath = "D:\\input.txt";
        String outputPath = "D:\\outputhPath.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(inputPath));
            PrintWriter writer = new PrintWriter(outputPath)){
           String line = reader.readLine();
           int counter = 1;
                while (line!=null){
                    if(counter%3 == 0){
                    writer.println(line);
                    }
                    line = reader.readLine();
                    counter++;
                }
        }catch (IOException expt){
            expt.printStackTrace();
        }
    }
}
