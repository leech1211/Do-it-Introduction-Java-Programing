package Chapter03;

public class OperationEx5 {

	public static void main(String[] args) {
		int num = 0B00000101;	//5를 8비트 2진수로 표현
		System.out.println(num << 2);	//10100
		System.out.println(num >> 2);	//1
		System.out.println(num >>> 2); 	//1

		System.out.println(num);
		num = num << 2;
		System.out.println(num);
	}

}
