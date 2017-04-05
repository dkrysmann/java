
package GettersAndSetters;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException
            , InstantiationException, ClassNotFoundException {
        Class getReflectionClass = Reflection.class;
        Method[] getAllMethods = getReflectionClass.getDeclaredMethods();
        Method[] printAllGetters = Arrays.stream(getAllMethods).filter(e -> e.getName().startsWith("get"))
                .toArray(Method[]::new);
        Method[] printallSetters = Arrays.stream(getAllMethods).filter(e -> e.getName().startsWith("set"))
                .toArray(Method[]::new);
        Field[] allFields = getReflectionClass.getDeclaredFields();
        Arrays.sort(allFields,Comparator.comparing(Field::getName));
        for (Field allField : allFields) {
            if(!Modifier.isPrivate(allField.getModifiers())){
                System.out.println(String.format("%s must be private!",allField.getName()));
            }
        }
        Arrays.sort(printAllGetters, Comparator.comparing(Method::getName));
        for (Method printallGetter : printAllGetters) {
            System.out.println(String.format("%s will return %s",
                    printallGetter.getName(), printallGetter.getReturnType()));
        }
        Arrays.sort(printallSetters, Comparator.comparing(Method::getName));
        for (Method printallSetter : printallSetters) {
            if (void.class.equals(printallSetter.getReturnType())) {
                if (printallSetter.getParameterCount() == 1) {
                    System.out.println(String.format("%s and will set field of %s", printallSetter.getName(), printallSetter.getParameterTypes()[0]));
                }
            }
        }
    }
}