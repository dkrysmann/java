package Test;

public class Demo {
    public static void main(String[] args) {
        UserAccount user = new UserAccount();
        for (int i = 0; i < 10; i++) {
            user.getRandomId();
            System.out.println(user);
        }

    }
}
