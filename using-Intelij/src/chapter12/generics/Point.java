package chapter12.generics;

public class Point <T,V>{
    //정수일 수 도 있고 실수 일 수 도 있다
    T x;
    V y;

    Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }
}
