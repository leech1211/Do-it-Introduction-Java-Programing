package Chapter03;

public class OperationEx5 {

	public static void main(String[] args) {
		int num = 0B00000101;	//5�� 8��Ʈ 2������ ǥ��
		System.out.println(num << 2);	//10100
		System.out.println(num >> 2);	//1
		System.out.println(num >>> 2); 	//1

		System.out.println(num);
		num = num << 2;
		System.out.println(num);
	}

}
