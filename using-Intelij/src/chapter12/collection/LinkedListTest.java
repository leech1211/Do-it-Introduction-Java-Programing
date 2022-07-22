package chapter12.collection;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> mylist = new LinkedList<String>();

        mylist.add("A");
        mylist.add("B");
        mylist.add("C");

        System.out.println(mylist);

        mylist.add(1,"D");  //첫번째 위치에 D추가
        System.out.println(mylist);

        mylist.addFirst("O");       //맨앞에 O 추가
        System.out.println(mylist);

        System.out.println(mylist.removeLast());    //맨 마지막 요소 삭제후  해당요소 출력
        System.out.println(mylist);
    }
}
