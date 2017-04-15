package AbstractClasses;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
        this.calcArea();
        this.calcPerimeter();
    }
    @Override
    public void calcPerimeter() {
        setPerimeter(this.radius*Math.PI * 2);
    }

    @Override
    public void calcArea() {
        setArea(this.radius * this.radius * Math.PI);
    }
}
