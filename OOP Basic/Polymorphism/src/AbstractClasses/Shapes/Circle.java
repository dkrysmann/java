package AbstractClasses.Shapes;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
        this.calculatePerimeter();
        this.calculateArea();
    }

    public final double getRadius() {
        return radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(this.radius * Math.PI * 2);
    }

    @Override
    public void calculateArea() {
        setArea(this.radius * this.radius * Math.PI);
    }
}
