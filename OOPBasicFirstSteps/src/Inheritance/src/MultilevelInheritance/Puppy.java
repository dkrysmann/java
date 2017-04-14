package MultilevelInheritance;


class Puppy extends Dog{
    protected void weep(){
        System.out.printf("%s can weep...%n",getClass().getSimpleName());
    }
}
