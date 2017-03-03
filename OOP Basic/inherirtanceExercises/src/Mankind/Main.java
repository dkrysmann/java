package Mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] student = reader.readLine().split("\\s+");
        String[] worker = reader.readLine().split("\\s+");
        try {
            Student student1 = new Student(student[0],student[1],student[2]);
            System.out.println(student1);
            System.out.println();
            Worker worker1 = new Worker(worker[0],worker[1],Double.parseDouble(worker[2]),Double.parseDouble(worker[3]));
            System.out.println(worker1);
        }catch (IllegalArgumentException er){
            System.out.println(er.getMessage());
        }
    }
}
