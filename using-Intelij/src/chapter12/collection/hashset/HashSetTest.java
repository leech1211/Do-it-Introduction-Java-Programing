package chapter12.collection.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(new String("황"));
        hashSet.add(new String("중"));
        hashSet.add(new String("태"));
        hashSet.add(new String("임"));
        hashSet.add(new String("무"));
        hashSet.add(new String("무"));

        System.out.println(hashSet);
    }
}
