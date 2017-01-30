import java.io.*;

public class Serializable {
    public static void main(String[] args) {
        String objectPath = "D:\\objtect.ser";
        Cube cube = new Cube();
        cube.color = "green";
        cube.depth = 14.54;
        cube.width = 30.02;
        cube.height = 25.3;
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(objectPath))){
            oos.writeObject(cube);
        }catch (IOException excp){
            excp.printStackTrace();
        }
        try(ObjectInputStream ois = ObjectInputStream(new FileInputStream(objectPath))){
            Cube loadedCube = (Cube)ois.readObject();
        }catch (IOException expt){
            expt.printStackTrace();
        }
    }

}