package chapter6.staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        Student Lee = new Student();
        Lee.setStudentName("이지원");
        System.out.println(Lee.serialNum);
        Lee.serialNum++;

        Student son = new Student();
        son.setStudentName("손흥민");
        System.out.println(Lee.serialNum);
        System.out.println(son.serialNum);
    }
}
