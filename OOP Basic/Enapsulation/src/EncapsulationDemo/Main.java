package EncapsulationDemo;


public class Main {
    public static void main(String[] args) {
       Person person = new Person("Stamat","Stamat",22);
        System.out.println(person.printInfo(person.getFirstName(),person.getLastName(),person.getAge()));

    }
}
