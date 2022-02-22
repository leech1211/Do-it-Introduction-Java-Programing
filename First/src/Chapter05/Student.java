package Chapter05;

public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);	//이름 주소출력
	}
	public void setStudentName(String name) {
		studentName = name;									//이름 입력
	}
	public String getStudentName() {
		return studentName;
	}
	
	
	

}


