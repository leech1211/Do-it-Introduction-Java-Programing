package chapter3;

public class OperationEx5 {
    public static void main(String[] args)
    {
        int num = 0B00000101; //5

        System.out.println(num << 2); // 왼쪽으로 2비트 00010100 = 20
        System.out.println(num >> 2); // 오른쪽으로 2비트 00000001 = 1
        System.out.println(num >>> 2); //>>> 는 채워지는 비트값이 부호비트와 상관없이 0으로 채워짐
        // >> 의 경우 기존값의 부호비트와 같은 비트가 채워짐

        System.out.println(num);

        num = num << 2;
        System.out.println(num);
    }
}
