package chapter6.cooperation;

public class Student {
    public String studentName;  //이름
    public int grade;           //학년
    public int money;           //학생이 가진 돈

    public Student(String name, int m)
    {
        this.studentName = name;
        this.money = m;
    }

    public void takeBus(Bus b)
    {
        b.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway s)
    {
        s.take(1500);
        this.money -= 1500;
    }

    public void showInfo()
    {
        System.out.println(studentName + "의 남은돈은 " + money + "입니다.");
    }
}
