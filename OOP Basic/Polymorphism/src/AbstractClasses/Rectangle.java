package AbstractClasses;


public class Rectangle extends Shape{
    private double height;
    private double width;
    public Rectangle(double height,double width){
        this.height = height;
        this.width = width;
        this.calculatePerimeter();
        this.calculateArea();
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void calculatePerimeter() {
            setPerimeter(2 * this.getWidth() + 2 * this.getWidth());
    }

    @Override
    public void calculateArea() {
        setArea(this.height * this.width);
    }
}
