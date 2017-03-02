package BigCat;


public class BigCat {
    private int weight;
    private String male;
    public BigCat(String male,int weight){
        this.male = male;
        this.weight = weight;
    }
    public String getMale(){
        return male;
    }
    public int getWeight(){
        return this.weight;
    }
}
