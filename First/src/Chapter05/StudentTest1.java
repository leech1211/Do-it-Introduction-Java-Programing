package Chapter05;

public class StudentTest1 {
	public static void main(String[] args) {
		Student std1 = new Student();
		std1.setStudentName("��ȣ��");		//ù�����л� ����
		System.out.println(std1.getStudentName());
		Student std2 = new Student();
		std2.setStudentName("��ȣ�� ģ�� ��â��");		//�ι�° �л� ����
		System.out.println(std2.getStudentName());
	}
}

//�ڹ濡���� garbage collector�� �޸������� �ڵ����� ����