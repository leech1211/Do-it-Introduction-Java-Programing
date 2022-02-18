package Chapter03;

public class p72 {

	public static void main(String[] args) {
		int num = 10;
		
		System.out.println(+num);	//10출력
		System.out.println(-num);	//-10 이 출력되지만 num은 10
		System.out.println(+num); 	//10출력
			
		num = -num; 				//num을 -10으로 변봔
		
		System.out.println(num);

	}

}
