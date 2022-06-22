package chapter5;

public class StudentTest {
    public static void main(String[] args)
    {
        Student studentLee = new Student();
        studentLee.studentName = "이동훈";

        System.out.println(studentLee.studentName);
        System.out.println(studentLee.getStudentName());
    }
}
