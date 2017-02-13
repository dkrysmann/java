import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Date;
import java.util.function.Function;

public class AddVat {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Function<Double,String> vat = x -> String.format("%.2f",x*1.2).replace('.',',');
        StringBuilder builder = new StringBuilder("Prices with VAT:").append(System.lineSeparator());
        Arrays.stream(reader.readLine().split(", ")).forEach(s->builder.append(vat.apply(Double.valueOf(s)
        )).append(System.lineSeparator()));
        System.out.println(builder);

    }
}
