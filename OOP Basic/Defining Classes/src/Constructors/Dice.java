package Constructors;


public class Dice {
    private int sides;
    //Constructor
    public Dice(){
        this.sides = 6;
    }
    public int getSides(){
        return this.sides;
    }
    //Another Constructor with parameters
    public Dice(int sides){
       this.sides = sides;
    }


}
