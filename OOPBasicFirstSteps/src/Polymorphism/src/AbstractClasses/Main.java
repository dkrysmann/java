package AbstractClasses;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.2);
        Shape rectangle = new Rectangle(5.0,6.0);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }
    }
}