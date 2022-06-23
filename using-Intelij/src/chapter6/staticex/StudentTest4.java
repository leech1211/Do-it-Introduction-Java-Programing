package chapter6.staticex;

public class StudentTest4 {
    public static void main(String[] args) {
        Student2 Lee = new Student2();
        Lee.setName("이희연");
        System.out.println(Student2.getSerialNum());
        System.out.println(Lee.Name + " 학번:" + Lee.ID);

        Student2 son = new Student2();
        son.setName("손흥민");
        System.out.println(Student2.getSerialNum());
        System.out.println(son.Name + " 학번:" + son.ID);
    }
}
