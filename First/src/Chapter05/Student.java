package Chapter05;

public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);	//�̸� �ּ����
	}
	public void setStudentName(String name) {
		studentName = name;									//�̸� �Է�
	}
	public String getStudentName() {
		return studentName;
	}
	
	
	

}


