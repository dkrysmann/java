package CustomStructure;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = " ";
        CustomListImplementation<String> list = new CustomListImplementation<>();
        while (!"END".equals(line = reader.readLine())){
            String[] inputs = line.split("\\s+");
            switch (inputs[0]){
                case "Add":
                    list.add(inputs[1]);
                    break;
                case "Remove":
                    list.remove(Integer.parseInt(inputs[1]));
                    break;
                case "Contains":
                    System.out.println(list.contains(inputs[1]));
                    break;
                case "Swap":
                    list.swap(Integer.parseInt(inputs[1]),Integer.parseInt(inputs[2]));
                    break;
                case "Grater":
                    System.out.println(list.countGreaterThan(inputs[1]));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    System.out.println(list);
                    break;
                    default:
                        break;
            }
        }
    }
}
