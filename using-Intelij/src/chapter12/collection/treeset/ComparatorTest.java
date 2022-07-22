package chapter12.collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Mycomapre implements Comparator<String> {
    @Override
    public int compare(String s1, String s2){
        return (s1.compareTo(s2)) * -1;
    }   //내임차순으로 정렬
}

public class ComparatorTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>(new Mycomapre());
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        System.out.println(set);
    }
}
