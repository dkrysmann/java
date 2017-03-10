package pawinc;


import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalCenterManager {
    private HashMap<String,AdoptionCenter> adoptionCenters;
    private HashMap<String,CleansingCenter> cleansingCenters;
    private List<Animal> cleansedAnimals;
    private List<Animal> adoptedAnimals;
    public AnimalCenterManager() {
        this.adoptionCenters = new HashMap<>();
        this.cleansingCenters = new HashMap<>();
        this.cleansedAnimals = new ArrayList<>();
        this.adoptedAnimals = new ArrayList<>();
    }

    public void registerCleansingCenter(String name){
        CleansingCenter cleansingCenter = new CleansingCenter(name);
        this.cleansingCenters.putIfAbsent(name,cleansingCenter);
    }
    public void registerAdoptionCenter(String name){
        AdoptionCenter adoptionCenter = new AdoptionCenter(name);
        this.adoptionCenters.putIfAbsent(name,adoptionCenter);
    }
    public void registerDog(String name, int age, int learnedCommands, String adoptionCenterName){
        Dog dog = new Dog(name,age,adoptionCenterName,learnedCommands);
        this.adoptionCenters.get(adoptionCenterName).register(dog);
    }
    public void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName){
        Cat cat = new Cat(name,age,adoptionCenterName,intelligenceCoefficient);
        this.adoptionCenters.get(adoptionCenterName).register(cat);
    }
    public void sendForCleansing(String adoptionCenterName, String cleansingCenterName){
        CleansingCenter cleansingCenter = this.cleansingCenters.get(cleansingCenterName);
        this.adoptionCenters.get(adoptionCenterName).sendForCleansing(cleansingCenter);
    }
    public void cleanse(String cleansingCenterName){
       List<Animal> cleansedAnimals = this.cleansingCenters.get(cleansingCenterName).cleanse();
        for (Animal cleansedAnimal : cleansedAnimals) {
            this.adoptionCenters.get(cleansedAnimal.getCenterName()).register(cleansedAnimal);
        }
        this.cleansedAnimals.addAll(cleansedAnimals);
    }
    public void adopt(String adoptionCenterName){
        List<Animal> adoptedAnimals = this.adoptionCenters.get(adoptionCenterName).adopt();
        this.adoptedAnimals.addAll(adoptedAnimals);
    }
    public void printStatistics(){
        StringBuilder builder = new StringBuilder();
        builder.append("Paw Incorporative Regular Statistics\n");
        builder.append(String.format("Adoption Centers: %d\n",this.adoptedAnimals.size()));
        builder.append(String.format("Adoption Centers: %d\n",this.cleansingCenters.size()));
        builder.append(String.format("Adopted Animals %s\n",getSortedAnimals(this.adoptedAnimals)));
        builder.append(String.format("Cleansed Animals %s\n",getSortedAnimals(this.cleansedAnimals)));
        builder.append(String.format("Animals Awaiting Adoption %d\n",getAwatingAdoptionCount(true)));
        builder.append(String.format("Animals Awaiting Cleansing %d\n",getAwatingCleansing(false)));
        System.out.println(builder.toString());
    }

    private int getAwatingCleansing(boolean flag) {
        int count = this.cleansingCenters.values().stream().flatMap(c -> c.getAnimals().stream())
                .filter(a->a.isCleansed() == flag)
                .collect(Collectors.toList()).size();
        return count;
    }

    private int getAwatingAdoptionCount(boolean flag) {
       int count = this.adoptionCenters.values().stream().flatMap(c -> c.getAnimals().stream())
               .filter(a->a.isCleansed() == flag)
               .collect(Collectors.toList()).size();
            return count;
    }

    private String getSortedAnimals(List<Animal> animals) {
        if(animals.isEmpty()){
            return "None";
        }
       List<String> sorted =  animals.stream().map(a->a.getName()).sorted(Collator.getInstance())
               .collect(Collectors.toList());
      String result = String.join(", ",sorted);
      return result;
    }

}
