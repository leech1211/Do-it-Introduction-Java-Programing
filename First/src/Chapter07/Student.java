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
		Subject sss = new Subject();	//과목생성
		sss.setName(n);		//과목이름
		sss.setScorePoint(score);		//점수
		subjectList.add(sss);		//배열에 저장
	}
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList)
		{
			total += s.getScorePoint();		//총점 더하기
			System.out.println("학생"+Name+"의 "+s.getName()+"과목 성적은"+s.getScorePoint()+"입니다");
		}
	}

}
