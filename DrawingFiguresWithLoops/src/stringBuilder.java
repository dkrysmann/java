
public class stringBuilder {
    public static void main(String[] args) {
        System.out.println(builder("*",20));
    }
    static String builder(String star,int count){
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < count; i++) {
            repeated.append(star);
        }
        return repeated.toString();
    }
}
