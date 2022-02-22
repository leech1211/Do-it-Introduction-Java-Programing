package Chapter06;

public class Student {
	public static int serialNum = 1000;		//static변수는 인스턴스생성과 상관없이 먼저 생성됨
	public int studentID;
	public String Name;
	public int grade;
	public int money;
	public String address;
	
	public Student() {			//학번 자동생성
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
	public void takeBus(Bus bus)		//버스를 타며 1000원을 지불하는 메소드
	{
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeSub(Subway subway)		//지하철을 타며 1500원을 지불하는 메소드
	{
		subway.take(1500);
		this.money -= 1500;
	}
	public void takeTexi(Texi texi)		//지하철을 타며 1500원을 지불하는 메소드
	{
		texi.take(7000);
		this.money -= 7000;
	}
	public void showInfo() {
		System.out.println(this.Name+"님의 남은돈은"+money+"원입니다.");
	}
}


