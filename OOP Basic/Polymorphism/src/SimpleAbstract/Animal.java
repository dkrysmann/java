package SimpleAbstract;


public abstract class Animal {
    public void printInformation(){
        System.out.println("i am" + this.getClass().getSimpleName() + ".");
        System.out.println(getTypicalSound());
    }
    protected abstract String getTypicalSound();
}
