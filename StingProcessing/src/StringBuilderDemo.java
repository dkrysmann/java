
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("123456");
            builder.insert(3,"password");
        System.out.println(builder);
        builder.delete(3,7);
        System.out.println(builder);
        builder.replace(3,7,"woo");
        System.out.println(builder);
        StringBuilder builder1 = new StringBuilder("12345678910");
        System.out.println(builder1.reverse());
    }
}
