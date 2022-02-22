package Chapter06;

public class StudentTest2 {
	public static void main(String[] args)
	{
		Student lee = new Student();
		lee.Name = "이이이";
		System.out.println(lee.serialNum);
		System.out.println(lee.Name+" 학번:"+lee.serialNum);
		
		Student bu = new Student();
		bu.Name = "부부부";
		System.out.println(bu.serialNum);
		System.out.println(bu.Name+" 학번:"+lee.serialNum);
	}
}
