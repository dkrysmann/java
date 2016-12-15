
public class methodWithParameters {
    public static void main(String[] args) {
        printGreeting("Momo",18);
    }
    static void printGreeting(String name,int age){
        System.out.println("Hello " + name);
        if(age >= 18){
            System.out.println("Here`s a beer!");
        }
        else{
            System.out.println("Sorry,here`s a lollipop");
        }
    }
}

