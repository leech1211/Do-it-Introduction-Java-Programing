package chapter12.collection.arraylist;

import java.util.ArrayList;

class myStack
{
    private ArrayList<String> arrayList = new ArrayList<String>();

    public void push(String data) {
        arrayList.add(data);
    }

    public String pop() {
        int len = arrayList.size();
        if(len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return (arrayList.remove(len-1));
    }
}
public class StackTest {
    public static void main(String[] args) {
        myStack stack = new myStack();

        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
