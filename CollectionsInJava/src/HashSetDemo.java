import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        TreeSet<Integer> numbers = new TreeSet<>();
        LinkedHashSet<Integer> linkedNums = new LinkedHashSet<>();
        hashSet(nums);
        treeSet(numbers);
        linkedHashSet(linkedNums);
        System.out.println(nums);
        System.out.println(numbers);
        System.out.println(linkedNums);
    }

    public static void hashSet(HashSet<Integer> nums) {
        nums.add(1);
        nums.add(1);
        nums.add(100);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(121);
        nums.add(3);
        nums.add(4);
        nums.add(4);
        nums.add(55);
        nums.add(43);
    }
    public static void treeSet(TreeSet<Integer> num){
        num.add(1);
        num.add(1);
        num.add(100);
        num.add(2);
        num.add(2);
        num.add(3);
        num.add(121);
        num.add(3);
        num.add(4);
        num.add(4);
        num.add(55);
        num.add(43);
    }
    public static void linkedHashSet(LinkedHashSet<Integer> linked){
        linked.add(1);
        linked.add(1);
        linked.add(100);
        linked.add(2);
        linked.add(2);
        linked.add(3);
        linked.add(121);
        linked.add(3);
        linked.add(4);
        linked.add(4);
        linked.add(55);
        linked.add(43);
    }
}
