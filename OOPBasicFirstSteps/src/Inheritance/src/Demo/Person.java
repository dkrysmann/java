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

   protected String printInformataion(){
        return String.format("Name - %s%nAge - %s",this.getName(),this.getAge());
   }
}
