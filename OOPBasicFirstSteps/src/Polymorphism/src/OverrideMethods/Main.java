package OverrideMethods;


public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0,3.0);
        Sqaure sqaure = new Sqaure(4);
        System.out.println(rectangle.calcArea());
        System.out.println(sqaure.calcArea());
    }
}
