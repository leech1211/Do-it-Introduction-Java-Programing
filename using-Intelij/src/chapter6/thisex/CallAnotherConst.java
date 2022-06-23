package chapter6.thisex;

class Person
{
    String name;
    int age;

    Person()
    {
        //이때 this를 사용한 명령이 가장 먼저 와야함
        this("이름없음",1); //아래 생성자 호출
    }

    Person(String n, int a)
    {
        this.name = n;
        this.age = a;
    }

    Person returnItslef()
    {
        return this; //this 반환
    }

}

public class CallAnotherConst {
    public static void main(String[] args) {
        Person noName = new Person();
        System.out.println(noName.name);
        System.out.println(noName.age);

        Person p = noName.returnItslef();
        System.out.println(p);
        System.out.println(noName);
    }
}
