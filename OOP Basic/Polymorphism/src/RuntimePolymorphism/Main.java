package RuntimePolymorphism;


public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,2);
        Square square = new Square(4);
        System.out.println(rectangle.calcArea());
        System.out.println(square.calcArea());
        Rectangle rect = new Square(8);
        System.out.println(rect.calcPerimeter());
        Rectangle rectangle1 = new Rectangle(12);
        System.out.println(rectangle1.calcPerimeter());
    }
}
