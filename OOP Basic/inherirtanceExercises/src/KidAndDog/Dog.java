package KidAndDog;


public class Dog {
    static int dogCounter;
   private String name;
    public Dog(String name){
        this.name = name;
        dogCounter+=1;
    }
    public String getName(){
        return this.name;
    }
    public void bark(){
        System.out.println("Wow-wow");
    }
}
