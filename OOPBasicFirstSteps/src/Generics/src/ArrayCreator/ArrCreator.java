package ArrayCreator;


import java.lang.reflect.Array;

public class ArrCreator {
    @SuppressWarnings("unchecked")
    public static <T> T[] create(Class<T> cl,int length, T item){
        T[] array = (T[])Array.newInstance(cl,length);
        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }
        return array;
    }
}
