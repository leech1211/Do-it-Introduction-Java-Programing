package Chapter06;

public class StudentTest1 {
	public static void main(String[] args)
	{
		Student lee = new Student();
		lee.Name = "��â��";
		System.out.println(lee.serialNum);
		lee.serialNum++;
		
		Student son = new Student();
		son.Name = "�ռռ�";
		System.out.println(son.serialNum);
		System.out.println(lee.serialNum);
	}
	//static������ ��� �ν��Ͻ��� �����Ѵ�
}
