package chapter4;

public class ForExample1 {
    public static void main(String[] args) {
        int i;
        int sum;
        for(i=1, sum=0;i<10;i++) //sum 도 0으로 초기화
        {
            sum += i;
        }
        System.out.println("10!");
    }
}
