// set
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        System.out.println("Set: " + set);
        System.out.println("Contains 20? " + set.contains(20));
        set.remove(10);
        System.out.println("After removing 10: " + set);
        System.out.println("Size: " + set.size());
        System.out.println("Is Empty? " + set.isEmpty());
        set.clear();
        System.out.println("After clear: " + set);
    }
}
// output
// set:[20,10,30]
// contains 20? true
// After removing 10: [20, 30]
// Size:20
//Is Empty? false
//After clear: []