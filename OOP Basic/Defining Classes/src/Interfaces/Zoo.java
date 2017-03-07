package Interfaces;


public class Zoo {
    public static void main(String[] args) {
        Bird bird = new Bird(1,"f",1);
        bird.sleep();
        Chicken chicken = new Chicken(1,"m",1);
        chicken.sleep();
        Sparrow sparrow = new Sparrow(1,"m",1);
        sparrow.fly();
        sparrow.eat();

    }

}
