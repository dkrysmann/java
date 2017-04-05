package Demo;

public class Person {
    private int age;
    private String name;

    public Person(int age,String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("age %s; name %s",this.age,this.name);
    }
}
