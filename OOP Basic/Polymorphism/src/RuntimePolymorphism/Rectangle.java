package RuntimePolymorphism;


public class Rectangle {
    private double sideA;
    private double sideB;
    public Rectangle(double sideA,double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public Rectangle(double sideA){
        this.sideA = sideA;
    }
    protected double getSideA(){
        return this.sideA;
    }
    private double getSideB(){
        return this.sideB;
    }
    public double calcArea(){
        return this.getSideA() * this.getSideB();
    }
    public double calcPerimeter(){
        return this.getSideA() * 2 + this.getSideB() * 2;
    }
}
