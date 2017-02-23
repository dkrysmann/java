package Test;


import java.util.Random;

public class UserAccount {
   private String username;
   private int id;

    public int getRandomId(){
      this.id = 6;
        Random random = new Random();
        int nextRandom = random.nextInt(this.id) + 1;
        return nextRandom;
    }

    @Override
    public String toString() {
        return "Random Account " + getRandomId();
    }
}
