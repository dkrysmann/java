import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.OptionalInt;

public class MapDistrict {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,List<Integer>> cities = new HashMap<>();
        String[] input = reader.readLine().split(" ");
        int limit = Integer.parseInt(reader.readLine());
        for (int i = 0; i < input.length; i++) {
            String[] cityArgs = input[i].split(":");
            String cityName = cityArgs[0];
            int districtPopulation = Integer.parseInt(cityArgs[1]);
            cities.putIfAbsent(cityName,new ArrayList<>());
            cities.get(cityName).add(districtPopulation);
        }
        cities.entrySet().stream().filter(c->c.getValue().stream().mapToInt(Integer::valueOf).sum()>limit)
        .sorted((e1,e2)-> Integer.compare(e2.getValue().stream().mapToInt(Integer::valueOf).sum(),
                e1.getValue().stream().mapToInt(Integer::valueOf).sum()))
        .forEach(e->{
            System.out.printf("%s: ",e.getKey());
            e.getValue().stream().sorted((n1,n2)->Integer.compare(n2,n1))
                    .limit(5)
                    .forEach(d-> System.out.print(d + " "));
            System.out.println();
        });

    }
}
