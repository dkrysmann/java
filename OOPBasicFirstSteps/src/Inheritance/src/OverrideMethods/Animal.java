package OverrideMethods;


import java.util.ArrayList;
import java.util.List;

public class Animal {
    private List<Food> eatenFoods;

    public Animal(){
        this.eatenFoods = new ArrayList<>();
    }
    public void eat(Food food){
        this.eatenFoods.add(food);
    }
    public void eatAll(Food[] foods){
        for (Food food : foods) {
            this.eat(food);
        }
    }
}
