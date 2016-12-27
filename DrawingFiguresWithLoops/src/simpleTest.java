
public class simpleTest {
    public static void main(String[] args) {
        repeatStr("Hi",5);
        repeatAgain("Hello",5);
    }
    static String repeatStr(String str,int count){
        String repeat = "";
        for(int a = 0;a < count;a++){
            repeat += str;
        }
        System.out.println(repeat);
        return  repeat;
    }
    static String repeatAgain(String again,int count){
        String repeat = "";
        for (int i = 0; i < count; i++) {
            repeat += again;
        }
        System.out.println(repeat);
        return repeat;
    }
}
