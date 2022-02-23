package Chapter07;
import java.util.ArrayList;

public class Student {
	int ID;
	String Name;
	ArrayList<Subject> subjectList;
	
	public Student(int n, String s) {		//constructor
		this.ID = n;
		this.Name = s;
		subjectList = new ArrayList<Subject>();
	}	
	public void addSubject(String n, int score)
	{
		Subject sss = new Subject();	//�������
		sss.setName(n);		//�����̸�
		sss.setScorePoint(score);		//����
		subjectList.add(sss);		//�迭�� ����
	}
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList)
		{
			total += s.getScorePoint();		//���� ���ϱ�
			System.out.println("�л�"+Name+"�� "+s.getName()+"���� ������"+s.getScorePoint()+"�Դϴ�");
		}
	}

}
