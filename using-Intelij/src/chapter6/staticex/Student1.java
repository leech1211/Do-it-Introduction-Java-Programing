package chapter6.staticex;

public class Student1 {
    public static int serialNum = 1000;
    public int ID;
    public String name;
    public int grade;
    public String address;

    public Student1()
    {
        serialNum++;
        ID = serialNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
