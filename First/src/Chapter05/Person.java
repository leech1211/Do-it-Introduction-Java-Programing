package Chapter05;

public class Person {
	String Name;
	float height;
	float weight;
	char gender;
	boolean married;
	
	public Person() { }					//����Ʈ ������
	
	public Person(String pname) {		//������� ������
		Name = pname;
	}
	public Person(String pname, float pheight, float pweight) {		//������� ������2
		Name = pname;
		height = pheight;
		weight = pweight;
	}
}
