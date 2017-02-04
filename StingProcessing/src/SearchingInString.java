
public class SearchingInString {
    public static void main(String[] args) {
        String email = "Vasko@gmail.com";
        int firstIndex = email.indexOf("@gmail.com");
        int noIndex = email.indexOf("@",6);
        String verse = "To be or not to be..";
        int lastIndex = verse.lastIndexOf("be");
        System.out.println(firstIndex);
        System.out.println(noIndex);
        System.out.println(lastIndex);
    }
}
