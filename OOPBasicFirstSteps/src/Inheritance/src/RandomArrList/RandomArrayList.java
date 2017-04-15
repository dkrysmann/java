package RandomArrList;


import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList{
    private Random randomGenerator;

    public RandomArrayList(){
        randomGenerator = new Random();
    }

    public Object getRandomElement(){
        int index = randomGenerator.nextInt(super.size());
        Object element = super.get(index);
        super.set(index,super.get(super.size()-1));
        super.remove(super.size()-1);

        return element;
    }
}
