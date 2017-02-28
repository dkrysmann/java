package FirstAndReserveTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] inputData = reader.readLine().split(" ");
            try {
                //  PersonValidationData person = new PersonValidationData(inputData[0], inputData[1], Integer.parseInt(inputData[2]),
                //          Double.parseDouble(inputData[3]));
                //  persons.add(person);
                persons.add(new Person(inputData[0], inputData[1], Integer.parseInt(inputData[2]),
                        Double.parseDouble(inputData[3])));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
        Team team = new Team("Loko Plovdiv");
        for (Person person : persons) {
            team.addPlayer(person);
        }
        team.printNumberOfPlayersInFirstTeam();
        team.printNumberOfPlayerInReserveTeam();

    }
}
