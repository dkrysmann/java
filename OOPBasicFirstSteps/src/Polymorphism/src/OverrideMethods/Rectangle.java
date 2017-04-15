package OverrideMethods;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA,double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    protected double getSideA() {
        return this.sideA;
    }
    protected double getSideB(){
        return this.sideB;
    }
    protected Rectangle(double sideA){
        this.sideA = sideA;
    }

    public double calcArea(){
        return this.getSideA() * this.getSideB();
    }
}
