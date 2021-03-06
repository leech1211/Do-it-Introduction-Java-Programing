package chapter11.object;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "x= " + x + ", y= " + y;
    }
}

class Circle implements Cloneable{  //객체를 복사해도 된다는 의미로 Cloneable인터페이스를 함께선언
    Point point;
    int radius;

    Circle(int x, int y, int r){
        radius = r;
        point = new Point(x,y);
    }

    public String toString(){
        return "원점은 " + point + "이고, 반지름은 " + radius + "이다";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {   //clone() 메서드를 사용해 circle 인스턴스를 copyCirle에 복제
        return super.clone();
    }

}
public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(10,20,30);
        Circle copyCircle = (Circle) circle.clone();     //clone()메서드를 사용해 circle인스턴스를 copyCircle에 복제함

        System.out.println(circle);
        System.out.println(copyCircle);
        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(copyCircle));


    }
}
