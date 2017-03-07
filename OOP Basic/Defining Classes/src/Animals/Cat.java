package Animals;

public class Cat extends Animal{
    public Cat(int age, String gender, int weight) {
        super(age, gender, weight);
    }
    public void meow(){
        System.out.println("meowing...");
    }
}
