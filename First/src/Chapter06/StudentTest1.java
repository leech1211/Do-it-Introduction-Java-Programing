package Chapter06;

public class StudentTest1 {
	public static void main(String[] args)
	{
		Student lee = new Student();
		lee.Name = "이창훈";
		System.out.println(lee.serialNum);
		lee.serialNum++;
		
		Student son = new Student();
		son.Name = "손손손";
		System.out.println(son.serialNum);
		System.out.println(lee.serialNum);
	}
	//static변수는 모든 인스턴스가 공유한다
}
