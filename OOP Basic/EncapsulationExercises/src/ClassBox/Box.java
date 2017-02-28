package ClassBox;


public class Box {
    private double lenght;
    private double width;
    private double height;

    public Box(double lenght,double width,double height){
        this.height = height;
        this.width = width;
        this.lenght = lenght;
    }
    private double getLenght(){
        return this.lenght;
    }
    private double getWidth(){
        return this.width;
    }
    private double getHeight(){
        return this.height;
    }
   private double getSurfaceArea(){
       return (2*this.getLenght() * this.getWidth()) +
               (2*this.getLenght() * this.getHeight()) +
               (2*this.getWidth() * this.getHeight());
   }
   private double getLateralSurfaceArea(){
       return (2*this.getLenght()*this.getHeight() + 2*this.getWidth()*this.getHeight());
   }
   private double getVolume(){
       return this.getLenght()*this.getWidth()*this.getHeight();
   }
   public void printResult(){
       System.out.printf("Surface Area - %.2f%n",this.getSurfaceArea());
       System.out.printf("Lateral Surface Area - %.2f%n",this.getLateralSurfaceArea());
       System.out.printf("Volume - %.2f",this.getVolume());
   }
}
