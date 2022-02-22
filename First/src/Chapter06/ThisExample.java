package Chapter06;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {
	public static void main(String[] args)
	{
		Birthday day = new Birthday();
		day.setYear(2000);
		System.out.println(day);
		day.printThis();
		//동적할당된 메모리주소(힙)은 실제주소가 아닌 자바가상머신이 생성한주소
	}

}
