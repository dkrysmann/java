package Animals;


public class Animal {
    int age;
    String gender;
    int weight;
    public Animal(int age,String gender,int weight){
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }
    protected void eat(){
        System.out.println("eating...");
    }
    protected void sleep(){
        System.out.println("sleeping...");
    }
}
