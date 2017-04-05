package Demo;


import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(20,"Pesho");
       Class person = Person.class;
        System.out.println(person.getName());
        System.out.println(person.getSimpleName());
        Field[] arr = person.getDeclaredFields();

    }
}
