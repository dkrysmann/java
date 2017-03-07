package Animals;


public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal(2,"M",20);
        animal.eat();
        animal.sleep();
        Bird bird = new Bird(1,"f",1);
       bird.fly();
       Cat cat = new Cat(2,"m",3);
       cat.meow();
    }
}
