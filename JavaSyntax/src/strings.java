
public class strings {
    public static void main(String[] args) {
        String name = "PeShO";
        System.out.println(name.toLowerCase());
        String lastName = "Penev";
        System.out.println(name + " " + lastName);
        System.out.println(name.concat(" " + lastName));
        System.out.println(name.charAt(1));
        String fName = "Ivan";
        String lName = "Ivanov";
        String fullName = fName + lName;
        System.out.println("Your full name is " + fullName);
        int age = 24;
        System.out.println("Hello im " + fullName + "and i am" + " " + age + "years old");
    }
}
