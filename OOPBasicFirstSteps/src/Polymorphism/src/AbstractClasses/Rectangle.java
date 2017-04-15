package AbstractClasses;


public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double heightm,double width){
        this.height = heightm;
        this.width = width;
        this.calcArea();
        this.calcPerimeter();
    }

    @Override
    public void calcPerimeter() {
        super.setPerimeter(2*this.height + 2 * this.width);
    }

    @Override
    public void calcArea() {
        super.setArea(this.height * this.width);
    }
}
