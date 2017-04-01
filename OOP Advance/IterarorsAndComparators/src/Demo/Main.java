package Demo;


public class Main {
    public static void main(String[] args) {
        print("PEsho");
        print("Pesho","Stamat");
        print();
        printNumbers(1,2,3,4,5,6,7,1000,-100);
        String[] array = {"Gosho","Plamen","Unufri"};
        print(array);
    }
    public static void print(String... varargs){
        if(varargs.length == 0){
            System.out.println("no args");
        }
        for (String vararg : varargs) {
            System.out.print(vararg + " ");
        }
    }
    public static void printNumbers(Integer... numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
