package chapter10.interfaceex;

public class CompleteCalc extends  Calculator{
    @Override
    public int times(int n1,int n2) {
        return n1 * n2;
    }

    @Override
    public int divide(int n1,int n2) {
       if(n2 != 0) {
           return n1/n2;
       }
       else
           return Calc.ERROR;   //나누는 수가 0인경우에 오류반환
    }

    public void showInfo() {
        System.out.println("Calc 인터페이스를 구현 해따");
    }

    @Override
    public void description() {
        System.out.println("재정의");
        super.description();
    }
}
