package MultilevelInheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Dog bigDog = new Dog();
        bigDog.bark();
        bigDog.eat();
        Puppy littleDog = new Puppy();
        littleDog.weep();
        littleDog.eat();

    }
}
