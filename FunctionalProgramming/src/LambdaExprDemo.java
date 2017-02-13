import java.util.function.Function;

public class LambdaExprDemo {
    public static void main(String[] args) {
        Function<Integer,String> function = n -> n.toString();
        System.out.println(function);
    }
}
