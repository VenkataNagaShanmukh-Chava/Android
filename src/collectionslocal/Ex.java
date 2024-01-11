package collectionslocal;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

public class Ex {

    public static void main(String[] args) {
        Hashtable<String, String> hashMap = new Hashtable<>(11, 0.5f);
        hashMap.put("abc", "some text");
        hashMap.put("xyz", "abcd");
        hashMap.put("abc","abcd0");

        for (String key : hashMap.keySet()){
            System.out.println(key.hashCode() % 11+ " " + key + " " +hashMap.get(key));
        }

    }
}
