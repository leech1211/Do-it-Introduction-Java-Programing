package chapter5.hiding;

public class Student {
    int studentID;
    private String studentName;
    int grade;
    String address;

    public String getStudentName()
    {
        return studentName;
    }
    public void setStudentName(String n)
    {
        this.studentName = n;
    }
}
