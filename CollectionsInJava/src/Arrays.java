
public class Arrays {
    public static void main(String[] args) {
       String[] data = {
               "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
       };
        for (int i = 0; i < data.length; i++) {
            System.out.printf("names[%d] = %s\n", i, data[i]);
        }
        System.out.println(String.join(" ",data));
    }
}
