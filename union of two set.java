
// union of two set
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);

        Set<Integer> s2 = new HashSet<>();
        s2.add(20);
        s2.add(40);
        s2.add(50);
         System.out.println("set 1"+s1);
         System.out.println("set 2"+s2);
        Set<Integer> union = new HashSet<>(s1);

        union.addAll(s2);

        System.out.println("Union of sets: " + union);
    }
}
// output
// set 1[20,10,30]
// set 2[50,20,40]
//Union of sets; [50,20,40,10,30]