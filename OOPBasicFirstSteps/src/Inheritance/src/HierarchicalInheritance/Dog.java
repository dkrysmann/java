package HierarchicalInheritance;


public class Dog extends Animal{
    protected void bark(){
        System.out.printf("%s can barking...%n",getClass().getSimpleName());
    }
}
