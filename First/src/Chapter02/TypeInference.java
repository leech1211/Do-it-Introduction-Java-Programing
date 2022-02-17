package Chapter02;

public class TypeInference {

	public static void main(String[] args) {
		var i = 10;		//int
		var j = 10.0;		//double
		var str = "hello";		//String
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";	//문자열은 다른 문자열 대입 가능
		//str = 3;		//String형에 다른 자료형 대입 불가

	}

}
