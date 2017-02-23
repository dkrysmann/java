package DefineClassPerson;


import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
       Class person = Person.class;
      Field[] fields = person.getDeclaredFields();
        System.out.println(fields.length);
        Person person1 = new Person();
        person1.setAge(2);
        person1.setName("Stamat");
        System.out.println(person1);
    }
}
class Person{
       private String name;
       private int age;

       public void setName(String name){
           this.name = name;
       }
      public void setAge(int age){
           this.age = age;
      }

    @Override
    public String toString() {
        return "Name " + this.name + " Age " + this.age;
    }
}