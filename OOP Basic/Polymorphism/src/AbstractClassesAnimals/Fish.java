package AbstractClassesAnimals;


public class Fish extends Animal{
    public Fish(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    @Override
    public void movement() {
        System.out.println(this.getClass().getSimpleName() + " " + "swimming");
    }

    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " " + "eat plankton");
    }
}
