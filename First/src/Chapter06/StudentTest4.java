package Chapter06;

public class StudentTest4 {
	public static void main(String[] args)
	{
		Student2 lee = new Student2();
		lee.Name = "��������";
		System.out.println(Student2.getSerialNum());	//Student2�� serialNum
		System.out.println(lee.Name+" �й�:"+lee.ID);		//lee�� serialNum
		
		Student2 king = new Student2();
		king.Name = "�հ�";
		System.out.println(Student2.getSerialNum());	//Student2�� serialNum
		System.out.println(king.Name+" �й�:"+king.ID);		//king�� serialNum
	}

}
