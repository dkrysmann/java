package SignleInheritance;


public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        dog.run();
    }
}
