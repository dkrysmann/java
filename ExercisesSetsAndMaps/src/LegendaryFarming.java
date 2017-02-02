import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> materials = new HashMap<String,Integer>(){
            {
                put("shards",0);
                put("fragments",0);
                put("motes",0);
            }
        };
        TreeMap<String,Integer> junk = new TreeMap<>();
        boolean breakPr = false;
        while (!breakPr){
            String[] inputMaterialAndQuantity = reader.readLine().toLowerCase().split(" ");
            for (int i = 0; i < inputMaterialAndQuantity.length; i+=2) {
                String material = inputMaterialAndQuantity[i+1];
                int quantity = Integer.parseInt(inputMaterialAndQuantity[i]);
                if(materials.containsKey(material)){
                    materials.put(material,materials.get(material)+quantity);
                    if(materials.get(material) >= 250){
                        materials.put(material,materials.get(material)-250);
                        breakPr = true;
                        if(material.equals("shards")){
                            System.out.printf("Shadowmourne obtained!");
                        }
                         if(material.equals("fragments")){
                            System.out.printf("Valanyr obtained!");
                        }if(material.equals("motes")) {
                            System.out.printf("Dragonwrath obtained!");
                        }
                    }
                }else{
                    if(!junk.containsKey(material)){
                        junk.put(material,0);
                    }
                    junk.put(material,  junk.get(material)+quantity);
                }
            }
        }
        materials.entrySet().stream().sorted((minValue,maxValue) -> maxValue.getValue().compareTo(minValue.getValue()))
                .forEach(pair -> System.out.println(String.format("%s %d",pair.getKey(),pair.getValue())));
        junk.entrySet().forEach(junkCol -> System.out.println(String.format("%s %d",junkCol.getKey(),junkCol.getValue())));
    }
}
