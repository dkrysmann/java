package ReflectionClassFile;

import javafx.scene.effect.Reflection;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class getReflectionClass = Reflection.class;
        System.out.println(getReflectionClass);
        Class getSuperClass = getReflectionClass.getSuperclass();
        System.out.println(getSuperClass);
        Class[] getInterfaces = getReflectionClass.getInterfaces();
        for (Class getInterface : getInterfaces) {
            System.out.println(getInterface);
        }
        Reflection reflection = (Reflection) getReflectionClass.newInstance();
        System.out.println(reflection);
    }
}
