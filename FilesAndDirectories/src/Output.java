import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;

public class Output {
    public static void main(String[] args) {
        String inputPath = "D:\\input.txt";
        String outputhPath = "D:\\outputhPath.txt";
        HashSet<Character> punctuation = new HashSet<>();
        Collections.addAll(punctuation,',','.','!','?');
        try(FileInputStream fis = new FileInputStream(inputPath);
            FileOutputStream fos = new FileOutputStream(outputhPath)){
            int oneByte = fis.read();
            while (oneByte >=0) {
                if (!punctuation.contains((char) oneByte)) {
                    fos.write(oneByte);
                }
                oneByte = fis.read();
            }
        }catch(IOException exc){
            exc.printStackTrace();
        }
    }
}
