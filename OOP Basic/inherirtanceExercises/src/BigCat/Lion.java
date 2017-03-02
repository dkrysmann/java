package BigCat;


public class Lion extends BigCat{
    String colorSkin;
    public Lion(String male,int weight,String colorSkin){
        super(male, weight);
        this.colorSkin = colorSkin;
    }
    public String getColorSkin(){
        return this.colorSkin;
    }
    public void printCat(){
        System.out.printf("Lion - %s,%nweight - %d,%nColor Skin - %s%n",this.getMale(),this.getWeight(),this.getColorSkin());
    }
}
