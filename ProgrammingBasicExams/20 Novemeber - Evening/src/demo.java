import java.util.List;
class Dog{
    String name;
    String breed;
    int age;
    List<Dog> children;
    Dog mother;

}
public class demo {

    public static void main(String[] args) {
        Dog Roshko = new Dog();
        Roshko.name = "Roshko";
        Roshko.breed = "Pitbul";
        Roshko.age = 2;
        Roshko.mother = new Dog();
        Roshko.mother.name = "Sara";
        System.out.println(Roshko.name + " " + Roshko.breed + " " + Roshko.age);
        System.out.println("Mather -> " + Roshko.mother.name);

    }
}

