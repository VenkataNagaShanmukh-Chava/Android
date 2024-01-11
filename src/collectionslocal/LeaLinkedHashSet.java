package collectionslocal;

import java.util.LinkedHashSet;

public class LeaLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> col = new LinkedHashSet<>(2);
        col.add("dish1");
        col.add("dish2");
        col.add("dish3");
        System.out.println(col);
        col.remove("dish2");
        col.add("new");
        col.add("mm");
        System.out.println(col);

    }
}
