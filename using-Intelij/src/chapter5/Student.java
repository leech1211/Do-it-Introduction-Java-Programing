package chapter5;

public class Student {

    int studentID;          //학번
    String studentName;     //이름
    int grade;              //학년
    String address;         //사는 곳

    public void showStudentInfo()
    {
        System.out.println(studentName + "," + address);        //이름, 주소출력
    }

    public String getStudentName()
    {
        return studentName;
    }
    public void setStudentID(String n)
    {
        studentName = n;
    }


    public static void main(String[] args)
    {
        Student studentLee = new Student();
        studentLee.studentName = "이창훈";

        System.out.println(studentLee.studentName);
        System.out.println(studentLee.getStudentName());
    }
}


