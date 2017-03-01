package Demo;


public class Main {
    public static void main(String[] args) {
        Person person = new Person("Gancho",24);
        person.sleep();
        System.out.println();
        Student student = new Student("Stamat",24,"Plovdiv");
        student.sleep();
        student.getTown();
    }
}
