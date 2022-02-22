package Chapter06;

public class StudentTest4 {
	public static void main(String[] args)
	{
		Student2 lee = new Student2();
		lee.Name = "율곡이이";
		System.out.println(Student2.getSerialNum());	//Student2의 serialNum
		System.out.println(lee.Name+" 학번:"+lee.ID);		//lee의 serialNum
		
		Student2 king = new Student2();
		king.Name = "왕건";
		System.out.println(Student2.getSerialNum());	//Student2의 serialNum
		System.out.println(king.Name+" 학번:"+king.ID);		//king의 serialNum
	}

}
