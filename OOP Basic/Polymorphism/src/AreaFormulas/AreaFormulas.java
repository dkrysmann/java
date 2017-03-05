package AreaFormulas;


public abstract class AreaFormulas {
    private double area;
    private double perimter;
    public AreaFormulas(){

    }

    protected double getArea() {
        return this.area;
    }

    protected void setArea(double area) {
        this.area = area;
    }
    protected double getPerimter(){
        return this.perimter;
    }
    protected void setPerimter(double perimter){
        this.perimter = perimter;
    }
    protected abstract void calcArea();
    protected abstract void calcPerimeter();

}
