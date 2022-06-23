package chapter6.staticex;

public class Student2 {
    private static int serialNum = 1000;
    int ID;
    String Name;
    int grade;
    String address;

    public Student2()
    {
        serialNum++;
        ID = serialNum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student2.serialNum = serialNum;
    }
}
