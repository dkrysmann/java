package OverrideMethods;

public class Sqaure extends Rectangle{

    protected Sqaure(double sideA) {
        super(sideA);
    }

    @Override
    public double calcArea(){
        return this.getSideA() * this.getSideA();
    }
}
