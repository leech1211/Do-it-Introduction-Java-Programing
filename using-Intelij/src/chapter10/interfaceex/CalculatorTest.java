package chapter10.interfaceex;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        CompleteCalc cala = new CompleteCalc();
        System.out.println(cala.add(num1,num2));
        System.out.println(cala.substract(num1,num2));
        System.out.println(cala.times(num1,num2));
        System.out.println(cala.divide(num1,num2));
        cala.showInfo();
        cala.description();

        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr));
    }
}
