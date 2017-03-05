package AreaFormulas;


public class Rectangle extends Sqaure{
    private double sideA;
    private double sideB;
    public Rectangle(double sideA,double sideB){
        this.sideA=sideA;
        this.sideB=sideB;
        this.calcArea();
        this.calcPerimeter();
    }

    private double getSideA() {
        return sideA;
    }

    private void setSideA(double sideA) {
        this.sideA = sideA;
    }

    private double getSideB() {
        return sideB;
    }

    private void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    protected void calcArea() {
        setArea(this.getSideA()*this.getSideB());
    }

    @Override
    protected void calcPerimeter() {
        setPerimter(2 * this.getSideA() + 2 * this.getSideB());
    }
}
