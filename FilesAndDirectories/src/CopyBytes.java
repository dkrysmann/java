import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {
        String inputPath =  "D:\\input.txt";
        String outputPath = "D:\\outputhPath.txt";
        try(FileInputStream fis = new FileInputStream(inputPath);
            FileOutputStream fos = new FileOutputStream(outputPath)){
            int oneByte = fis.read();
            while (oneByte>=0){
                if(oneByte == ' '|| oneByte == '\n'){
                    fos.write(oneByte);
                }else{
                    String decimal = String.valueOf(oneByte);
                    for (char c : decimal.toCharArray()) {
                        fos.write(c);
                    }
                }
                oneByte = fis.read();
            }
        }catch (IOException excp){
                excp.printStackTrace();
        }
    }
}
