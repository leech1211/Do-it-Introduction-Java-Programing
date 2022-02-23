package Chapter07;

public class Subject {
	private String name;		//과목이름
	private int scorePoint;		//과목점수

	
	public String getName() {
		return name;
	}
	public void setName(String s)
	{
		this.name = s;
	}
	public int getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(int n) {
		this.scorePoint = n;
	}
}
