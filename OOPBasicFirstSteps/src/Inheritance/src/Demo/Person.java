package Demo;


public class Person {
   private String name;
   private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    protected String getName() {
        return this.name;
    }

    protected int getAge() {
        return this.age;
    }

   public void printInformation(){
       System.out.printf("Name - %s%nAge - %s%n",this.getName(),this.getAge());
   }
}
