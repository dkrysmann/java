package PersonClass;


import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<TestAccount> accounts;

    public Person(String name,int age){
       this(name,age,new ArrayList<>());
    }
    public Person(String name,int age, List<TestAccount> accounts){
        this.name = name;
        this.age = age;
        this.accounts = accounts;
    }

}
