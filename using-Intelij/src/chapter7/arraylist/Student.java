package chapter7.arraylist;


import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subjectt> subjectList;

    public Student(int i, String n)
    {
        studentID = i;
        studentName = n;
        subjectList = new ArrayList<Subjectt>();
    }

    public void addSubject(String n, int s)
    {
        Subjectt subject = new Subjectt();
        subject.setName(n);
        subject.setScorePoint(s);
        subjectList.add(subject);
    }

    public void showStudentInfo()
    {
        int total = 0;
        for(Subjectt s : subjectList)
        {
            total += s.getScorePoint();
            System.out.println(studentName + "의 " + s.getName() + " 점수는 " + s.getScorePoint() + " 입니다");
        }
        System.out.println(studentName + " 의 총점은 " + total + " 입니다");
    }
}
