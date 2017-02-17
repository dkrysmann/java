package Game;

public class game {
    public static void main(String[] args) {
      Champion mage = new Mage("Stamat");
        Champion warrior = new Warrior("Unufri");
        System.out.println(mage.getAttackCost());
        System.out.println(warrior.getAttackCost());
    }
}
