package AbstractClassesAnimals;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird(1,"f",2);
        bird.movement();
        bird.eat();
        Animal fish = new Fish(1,"m",1);
        fish.movement();
        fish.eat();
        Sparrow sparrow = new Sparrow(1,"m",1);
        sparrow.fly();
        sparrow.eat();
    }
}
