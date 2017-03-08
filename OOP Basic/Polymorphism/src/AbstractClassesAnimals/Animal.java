package AbstractClassesAnimals;


public abstract class Animal {
    private int age;
    private String gender;
    private int weight;

    public Animal(int age,String gender,int weight){
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }
    public abstract void movement();
    public abstract void eat();
}
