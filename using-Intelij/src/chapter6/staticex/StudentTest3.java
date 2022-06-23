package chapter6.staticex;

public class StudentTest3 {
    public static void main(String[] args) {
        Student1 Lee = new Student1();
        Lee.setName("이지원");
        System.out.println(Student1.serialNum);
        System.out.println(Lee.getName() + " 학번:" + Lee.ID);

        Student1 son = new Student1();
        son.setName("손흥민");
        System.out.println(Student1.serialNum);
        System.out.println(son.getName() + " 학번:" + son.ID);
    }
}
