import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        System.out.println("Initial Arraylist:"+list);

        HashSet<Integer> set = new HashSet<>(list);

        System.out.println("After removing duplicates:"+set);
    }
}
// output
// Intial Arraylist:[10,20,10,30,20]
// After removing duplicates:[20,10,30]
