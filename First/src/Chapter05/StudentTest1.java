package Chapter05;

public class StudentTest1 {
	public static void main(String[] args) {
		Student std1 = new Student();
		std1.setStudentName("안호수");		//첫번쨰학생 생성
		System.out.println(std1.getStudentName());
		Student std2 = new Student();
		std2.setStudentName("안호수 친구 이창훈");		//두번째 학생 생성
		System.out.println(std2.getStudentName());
	}
}

//자방에서는 garbage collector가 메모리해제를 자동으로 해줌