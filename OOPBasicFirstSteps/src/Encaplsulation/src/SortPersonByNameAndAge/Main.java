package SortPersonByNameAndAge;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputNumOfPersons = Integer.parseInt(reader.readLine());
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < inputNumOfPersons; i++) {
            String[] spliter = reader.readLine().split(" ");
            personList.add(new Person(spliter[0],spliter[1],Integer.parseInt(spliter[2])));
        }
        Collections.sort(personList, (firstPerson,secondPerson) -> {
            int sComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());
            if (sComp != 0) {
                return sComp;
            } else {
                return firstPerson.getAge().compareTo(secondPerson.getAge());
            }
        });
        for (Person person : personList) {
            System.out.println(person.toString());
        }
    }
}
