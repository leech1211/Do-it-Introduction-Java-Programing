package Chapter06;

public class StudentTest2 {
	public static void main(String[] args)
	{
		Student lee = new Student();
		lee.Name = "������";
		System.out.println(lee.serialNum);
		System.out.println(lee.Name+" �й�:"+lee.serialNum);
		
		Student bu = new Student();
		bu.Name = "�κκ�";
		System.out.println(bu.serialNum);
		System.out.println(bu.Name+" �й�:"+lee.serialNum);
	}
}
