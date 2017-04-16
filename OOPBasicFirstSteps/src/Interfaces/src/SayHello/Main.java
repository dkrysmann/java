package SayHello;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Bulgarian("Пешо"));
        people.add(new European("James"));
        people.add(new Chinese("Jet Lee"));
        for (Person person : people) {
            printHelloMsg(person);
        }
    }
    public static void printHelloMsg(Person person){
        person.sayHello();
    }
}
