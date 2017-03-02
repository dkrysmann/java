package KidAndDog;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Dog dog = new Dog("Sharo");
            Dog dog1 = new Dog("Neron");
            Kid kid = new Kid("Momo",12);
            kid.callTheDog(dog);
        System.out.println();
           kid.wagTheDog(dog);
           kid.callTheDog(dog1);
           kid.wagTheDog(dog1);
        System.out.printf("We have %d dogs ", Dog.dogCounter);
    }
}
