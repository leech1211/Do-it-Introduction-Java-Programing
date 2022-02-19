package Chapter04;

public class IfExample2 {

	public static void main(String[] args) {
		int age = 9;
		int charge;
		
		if(age < 8)
		{
			charge = 1000;
			System.out.println("미취학아동");
		}
		else if(age < 14)
		{
			charge = 2000;
			System.out.println("초딩");
		}
		else if(age < 20)
		{
			charge = 2500;
			System.out.println("중딩이거나 고딩");
		}
		else
		{
			charge = 3000;
			System.out.println("일반");
		}
		System.out.println("입장료는 "+charge+"원 입니다");
	}

}
