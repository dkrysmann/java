package SayHelloExt;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Bulgarian("Stamat"));
        personList.add(new European("Garet"));
        personList.add(new Chinese("BruceLee"));
        for (Person person : personList) {
            printMsg(person);
        }
    }
    private static void printMsg(Person person){
        System.out.println(person.sayHello());
    }
}
