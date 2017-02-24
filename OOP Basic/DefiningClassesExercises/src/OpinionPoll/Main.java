package OpinionPoll;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int lines = Integer.parseInt(reader.readLine());
        List<Person> container = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            String[] input = reader.readLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name,age);
            container.add(person);
        }
            container.stream().filter(person -> person.getAge() > 30).sorted(Comparator.comparing(person -> person.getName()
            )).forEach(person -> person.printResult(person.getName(),person.getAge()));
    }
}
