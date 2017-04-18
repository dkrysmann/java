package Demo;

import java.util.Stack;
import java.util.stream.Stream;

public class Jar<E> {
   private Stack<E> container;
    public Jar(){
        this.container = new Stack<>();
    }
    public void add(E element){
        this.container.push(element);
    }
    public E remove(){
        return this.container.pop();
    }
    public void printRemaingElements(){
        Stream.of(this.container).forEach(System.out::println);
    }
}
