package pawinc;

import java.util.ArrayList;
import java.util.List;

public class CleansingCenter extends Center{


    public CleansingCenter(String name) {
        super(name);
    }
    public List<Animal> cleanse(){
        List<Animal> cleandesAnimal = new ArrayList<>();
        super.getAnimals().stream().forEach(a-> {
            a.cleanse();
            cleandesAnimal.add(a);
        });
        super.removeAnimals(cleandesAnimal);
        return cleandesAnimal;
    }
}
