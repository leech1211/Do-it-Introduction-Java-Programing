package Chapter06;

public class Student2 {
	private static int serialNum = 1000;
	int ID;
	String Name;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		ID = serialNum;
	}
	
	public String getStudentName() {
		return Name;
	}
	
	public void setStudentName(String n) {
		this.Name = n;
	}
	
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}
	public static void setSerialNum(int num) {
		Student2.serialNum = num;
	}

}
