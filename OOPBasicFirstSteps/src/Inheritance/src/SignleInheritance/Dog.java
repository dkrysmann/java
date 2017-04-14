package SignleInheritance;


class Dog extends Animal{
    protected void bark(){
        System.out.println("Barking....");
    }
    protected void run(){
        System.out.printf("%s can run fast",getClass().getSimpleName());
    }
}
