package AbstractClasses.Shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.5);
        Shape recta = new Rectangle(5.0,6.0);
        List<Shape> list = new ArrayList<>();
        list.add(circle);
        list.add(recta);
        for (Shape shape : list) {
            System.out.println(shape.getArea());
        }
        for (Shape shape : list) {
            System.out.println(shape.getPerimeter());
        }
    }
}