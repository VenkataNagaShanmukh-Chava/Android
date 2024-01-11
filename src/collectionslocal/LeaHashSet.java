package collectionslocal;

import java.util.HashMap;
import java.util.HashSet;

public class LeaHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("dish1");
        set.add("dish2");
        set.add("dish3");
        set.add("dish4");
        System.out.println(set);
        System.out.println("__________________");
        set.remove("dish2");
        set.add("newdishadd");
        set.add(null);
        set.add("new");
        System.out.println(set);

    }
}
