package chapter10.interfaceex;

public interface Calc {
    double PI = 3.14;
    int ERROR = -999999;    //인터페이스에서 선언한 변수는 컴파일과정에서 상수로 변환됨

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
    //인터페이스에서 선언한 메소드는 컴파일과정에서 추상메소드로 변경됨

    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
    }

    static int total(int[] arr) {
        int total = 0;

        for(int i:arr){
            total += i;
        }
        myStaticMethd();
        return total;
    }
    private void myMethod() {
        System.out.println("private 메소드 입니다.");
    }
    private static void myStaticMethd() {
        System.out.println("private static 메소드 입니다.");
    }
}
