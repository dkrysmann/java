package Game;

public class Mage extends Champion {
    private final static int HEALTH = 80;
    private final static int POWER = 40;
    private final static int ENERGY = 20;
    private final static int ATTACK_COST = 8;

    private int health;
    private int power;
    private int energy;
    private int attackCost;
    private String name;

    public Mage(String name){
        super(HEALTH,POWER,ENERGY,ATTACK_COST,name);
    }
    //constructor
    public Mage(int health, int power, int energy, int attackCost, String name) {
     super(health, power, energy, attackCost, name);
    }

    @Override
    public void attack(Champion mage) {
        if(mage.equals(this)){
            throw new IllegalStateException("Invalid operation");
        }
    }

    @Override
    public void respond() {

    }
}
