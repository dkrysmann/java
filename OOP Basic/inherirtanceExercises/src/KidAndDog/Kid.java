package KidAndDog;

public class Kid {
   private String name;
   private int age;
    public Kid(String name,int age){
        this.name = name;
        this.age = age;
    }
    private String getName(){
        return this.name;
    }
    private int getAge(){
        return this.age;
    }
    public void callTheDog(Dog dog){
        System.out.printf("Come here %s",dog.getName());
    }
    public void wagTheDog(Dog dog){
        System.out.printf("%s ",dog.getName());
        dog.bark();
    }
}
