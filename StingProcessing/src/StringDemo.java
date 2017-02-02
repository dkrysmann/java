
public class StringDemo {
    public static void main(String[] args) {
        Double num = 1.23456;
        String value = String.format("Precision 3: %1$.3f",num);
        System.out.println(value);
        System.out.printf("%f",num);
    }
}
