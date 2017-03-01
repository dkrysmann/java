package Demo;

public class Person {
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void sleep(){
        System.out.printf("%s can sleep",this.name);
    }

}
