package AbstractClassesAnimals;


public class Bird extends Animal{
    public Bird(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    @Override
    public void movement() {
        System.out.println(this.getClass().getSimpleName() + " " + "flapping with wings");
    }

    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " " + "eat insects");
    }
}
