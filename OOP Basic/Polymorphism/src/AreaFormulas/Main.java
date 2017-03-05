package AreaFormulas;


public class Main {
    public static void main(String[] args) {
        {
            AreaFormulas sqaure = new Sqaure(2);
            System.out.println(sqaure.getArea());
            System.out.println(sqaure.getPerimter());
            AreaFormulas rectange = new Rectangle(4,4);
            System.out.println(rectange.getArea());
            System.out.println(sqaure.getPerimter());
        }
    }
}