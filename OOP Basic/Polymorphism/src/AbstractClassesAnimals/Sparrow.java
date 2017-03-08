package AbstractClassesAnimals;

public class Sparrow extends Bird implements Flyable{
    public Sparrow(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " " + "can flying high");
    }
    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " " + "can eat insects");
    }
}
