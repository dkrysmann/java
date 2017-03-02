package BigCat;


public class AfricanLion extends Lion{
    public AfricanLion(String male,int weight,String colorSkin){
        super(male, weight, colorSkin);
    }

   public void printAfricanLion(){
       System.out.printf("African Lion - %s%nWeight - %d%nColor Skin - %s",this.getMale(),this.getWeight(),this.getColorSkin());
   }
}
