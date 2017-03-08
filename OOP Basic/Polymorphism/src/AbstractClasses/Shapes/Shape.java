package AbstractClasses.Shapes;


public abstract class Shape {
    private double perimeter;
    private double area;
    protected Shape(){

    }

    protected double getPerimeter() {
        return this.perimeter;
    }

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    protected double getArea() {
        return this.area;
    }

    protected void setArea(double area) {
        this.area = area;
    }
    protected abstract void calculatePerimeter();
    protected abstract void calculateArea();
}
