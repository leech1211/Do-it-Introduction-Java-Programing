package chapter5.hiding;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        //studentLee.studentName = "이상원";     //private이므로 접근 불가
        studentLee.setStudentName("상원");

        System.out.println(studentLee.getStudentName());
    }
}
