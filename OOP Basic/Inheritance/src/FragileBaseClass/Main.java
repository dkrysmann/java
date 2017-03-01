package FragileBaseClass;


public class Main {
    public static void main(String[] args) {
        Predator predator = new Predator();
      //  animal.eatAll(new Food[]{new Food(),new Food()});
        predator.feedAll(new Food[]{new Food(),new Food()});
        predator.feed(new Food());
        System.out.println();
    }
}
