package Game;

public abstract class Champion {
    private int health;
    private int power;
    private int energy;
    private int attackCost;
    private String name;

    //constructor
    protected Champion(int health,int power,int energy,int attackCost,String name){
        this.health = health;
        this.power = power;
        this.energy = energy;
        this.attackCost = attackCost;
        this.name = name;
    }
    //methods for Warrior and Mage
    public abstract void attack(Champion champion);
    public abstract  void respond();

    //Set Getters
    public int getHealth(){
        return this.health;
    }
    public int getPower(){
        return this.power;
    }
    public int getEnergy(){
        return this.energy;
    }
    public int getAttackCost(){
        return this.attackCost;
    }
    public String getName(){
        return this.name;
    }

    //Set Setters
    public void setHealth(int health) {
        this.health = health;
    }
    public void setPower(int power){
        this.power = power;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public void setAttackCost(int attackCost){
        this.attackCost = attackCost;
    }
    public void setName(String name){
        this.name = name;
    }
}
