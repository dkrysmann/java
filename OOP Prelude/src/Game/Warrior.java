package Game;

public class Warrior  extends Champion {
    private final static int HEALTH = 100;
    private final static int POWER = 20;
    private final static int ENERGY = 50;
    private final static int ATTACK_COST = 10;

    private int health;
    private int power;
    private int energy;
    private int attackCost;
    private String name;

     public Warrior(String name){
         super(HEALTH,POWER,ENERGY,ATTACK_COST,name);
     }
    //constructor
    public Warrior(int health, int power, int energy, int attackCost, String name) {
       super(health, power, energy, attackCost, name);
    }

    @Override
    public void attack(Champion champion) {

    }


    @Override
    public void respond() {

    }
}