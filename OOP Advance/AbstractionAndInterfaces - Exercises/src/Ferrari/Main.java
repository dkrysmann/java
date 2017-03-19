package Ferrari;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.instrument.IllegalClassFormatException;

public class Main {
    public static void main(String[] args) throws IllegalClassFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String driver = reader.readLine();
        Ferrari ferrari = new Ferrari("488-Spider",driver);
        System.out.println(String.format("%s/%s/%s/%s",ferrari.getModel(),ferrari.pushBrakes(),
                ferrari.pushGas(),ferrari.getDriverName()));
        String ferrari1 = Ferrari.class.getSimpleName();
        String carInterface = Car.class.getSimpleName();
        boolean isCreated = Car.class.isInterface();
        if(!isCreated){
            throw new IllegalClassFormatException("No interface created");
        }
    }
}
