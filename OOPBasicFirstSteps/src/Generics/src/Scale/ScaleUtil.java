package Scale;


public class ScaleUtil <T extends Comparable<T>>{
    private T left;
    private T right;

    public ScaleUtil(T left,T right){
        this.left = left;
        this.right = right;
    }
    public T getHeavier(){
       if(left.compareTo(right) < 0){
           return right;
       }else if(left.compareTo(right) > 0){
           return left;
       }else{
           return null;
       }
    }
}
