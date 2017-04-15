package Demo;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Stamat",26);
        Student student = new Student("Pepo",30,"game dev");
        person.printInformation();
        student.printInformation();
    }
}
