package RuntimePolymorphism;

public class Square extends Rectangle{
    public Square(double side){
        super(side);
    }
    @Override
    public double calcArea(){
       return this.getSideA() * this.getSideA();
    }
    @Override
    public double calcPerimeter(){
        return this.getSideA() * 4;
    }
}
