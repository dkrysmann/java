package p04_ListUtilities;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> collect = new ArrayList<>();
        Collections.addAll(collect,1,null,2,3,null);
        System.out.println(ListUtils.getNullIndices(collect));
    }
}
