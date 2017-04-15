package HierarchicalInheritance;


public class Cat extends Animal{
    public void meow(){
        System.out.printf("%s can meowing...%n",getClass().getSimpleName());
    }
}
