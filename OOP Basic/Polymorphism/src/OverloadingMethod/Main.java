package OverloadingMethod;


public class Main {
    public static void main(String[] args) {
        MathOperation operation = new MathOperation();
        System.out.println(operation.addNumbers(1,2));
        System.out.println(operation.addNumbers(1,2,3));
        System.out.println(operation.addNumbers(1,2,3,4));
    }
}
