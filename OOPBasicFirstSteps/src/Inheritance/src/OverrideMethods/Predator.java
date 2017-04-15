package OverrideMethods;

public class Predator extends Animal{
    private int health;

    @Override
    public void eat(Food food){
        super.eat(food);
        this.health+=1;
    }
}
