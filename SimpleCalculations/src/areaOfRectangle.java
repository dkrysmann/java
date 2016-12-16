import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());

        double width = Math.abs(x1 - x2);
        double height = Math.abs(y1 - y2);

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println(area);
        System.out.println(perimeter);
    }
}
