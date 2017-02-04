
public class TrimmingTest {
    public static void main(String[] args) {
        String s = "   example of white space     ";
        String clean = s.trim();
        System.out.println(clean);

        String startWith = "C# is the best!";
        boolean isQuestion = startWith.startsWith("Java");
        System.out.println(isQuestion);

        String endwith = "How are you?";
        boolean isEndWith = endwith.endsWith("?");
        System.out.println(isEndWith);
    }
}
