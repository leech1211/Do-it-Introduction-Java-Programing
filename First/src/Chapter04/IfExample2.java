package Chapter04;

public class IfExample2 {

	public static void main(String[] args) {
		int age = 9;
		int charge;
		
		if(age < 8)
		{
			charge = 1000;
			System.out.println("�����оƵ�");
		}
		else if(age < 14)
		{
			charge = 2000;
			System.out.println("�ʵ�");
		}
		else if(age < 20)
		{
			charge = 2500;
			System.out.println("�ߵ��̰ų� ���");
		}
		else
		{
			charge = 3000;
			System.out.println("�Ϲ�");
		}
		System.out.println("������ "+charge+"�� �Դϴ�");
	}

}
