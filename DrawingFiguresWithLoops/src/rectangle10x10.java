
public class rectangle10x10 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(printStars("*",10));
        }
    }
    static String printStars(String star,int count){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < count; i++) {
            s.append(star);
        }
        return s.toString();
    }
}
