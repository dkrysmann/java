package rpg_lab;


public interface Target {
    int getHealth();
    void takeAttack(int attackPoint);
    int giveExprerience();
    boolean isDead();
}
