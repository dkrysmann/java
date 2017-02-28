package ClassBoxDataValidation;


public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length,double width,double height){
       this.setLenght(length);
       this.setWidth(width);
       this.setHeight(height);
    }
    private double getLenght(){
        return this.length;
    }
    private void setLenght(double length){
        if(length <= 0){
            String errorMsg = "Length cannot be zero or negative.";
            throw new IllegalArgumentException(errorMsg);
        }
        this.length = length;
    }
    private double getWidth(){
        return this.width;
    }
    private void setWidth(double width){
        if(width <= 0){
            String errorMsg = "Width cannot be zero or negative.";
            throw new IllegalArgumentException(errorMsg);
        }
        this.width = width;
    }
    private double getHeight(){
        return this.height;
    }
    private void setHeight(double height){
        if(height<=0){
            String errorMsg = "Height cannot be zero or negative.";
            throw new IllegalArgumentException(errorMsg);
        }
        this.height = height;
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
