import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntermediateOperations {
    public static void main(String[] args) {
      List<String> elements = new ArrayList<>();
      Collections.addAll(elements,"one","two","three","four","fiveeee");
      elements.stream().filter(s->s.length() <= 4).skip(1).forEach(s-> System.out.println(s));
    }
}
