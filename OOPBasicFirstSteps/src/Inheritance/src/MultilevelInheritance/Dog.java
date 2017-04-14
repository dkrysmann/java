package MultilevelInheritance;


 class Dog extends Animal{
    protected void bark(){
        System.out.printf("%s can bark...%n",getClass().getSimpleName());
    }
}
