package SayHello;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Bulgarian("Pesho"));
        persons.add(new European("Stamat"));
        persons.add(new Chinese("Bruce Lee"));
        for (Person person : persons) {
            printPerson(person);
        }
    }

    private static void printPerson(Person person) {
        System.out.println(person.sayHello());
    }
}