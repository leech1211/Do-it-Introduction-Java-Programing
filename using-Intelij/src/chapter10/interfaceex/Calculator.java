package chapter10.interfaceex;

public abstract class Calculator implements Calc{  //추상클래스
    @Override
    public int add(int n1,int n2) {
        return n1 + n2;
    }

    @Override
    public int substract(int n1,int n2) {
        return n1 - n2;
    }
}
//time과 divide를 구현하지 않았기에 추상클래스