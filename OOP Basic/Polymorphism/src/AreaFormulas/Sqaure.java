package AreaFormulas;


public class Sqaure extends AreaFormulas{
    private double side;
    public Sqaure(double side){
        this.side = side;
        this.calcArea();
        this.calcPerimeter();
    }
    public Sqaure(){

    }

    private double getSide() {
        return this.side;
    }

    private void setSide(double side) {
        this.side = side;
    }

    @Override
    protected void calcArea() {
      setArea(this.getSide() * this.getSide());
    }

    @Override
    protected void calcPerimeter() {
        setPerimter(this.getSide() * 4);
    }
}
