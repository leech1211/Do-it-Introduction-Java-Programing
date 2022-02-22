package Chapter06;

public class Student {
	public static int serialNum = 1000;		//static������ �ν��Ͻ������� ������� ���� ������
	public int studentID;
	public String Name;
	public int grade;
	public int money;
	public String address;
	
	public Student() {			//�й� �ڵ�����
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(String n, int g, int m)
	{
		this.Name = n;
		this.grade = g;
		this.money = m;
	}
	public Student(String n, int m)
	{
		this.Name = n;
		this.money = m;
	}
	public void takeBus(Bus bus)		//������ Ÿ�� 1000���� �����ϴ� �޼ҵ�
	{
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeSub(Subway subway)		//����ö�� Ÿ�� 1500���� �����ϴ� �޼ҵ�
	{
		subway.take(1500);
		this.money -= 1500;
	}
	public void takeTexi(Texi texi)		//����ö�� Ÿ�� 1500���� �����ϴ� �޼ҵ�
	{
		texi.take(7000);
		this.money -= 7000;
	}
	public void showInfo() {
		System.out.println(this.Name+"���� ��������"+money+"���Դϴ�.");
	}
}


