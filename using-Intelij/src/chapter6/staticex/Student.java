package chapter6.staticex;

public class Student {
    public static int serialNum = 1000;
    public int ID;
    public String name;
    public int grade;
    public String address;

    public String getStudentName()
    {
        return name;
    }

    public void setStudentName(String n)
    {
        name = n;
    }
}
