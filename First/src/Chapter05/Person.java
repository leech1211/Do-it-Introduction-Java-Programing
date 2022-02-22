package Chapter05;

public class Person {
	String Name;
	float height;
	float weight;
	char gender;
	boolean married;
	
	public Person() { }					//디폴트 생성자
	
	public Person(String pname) {		//만들어준 생성자
		Name = pname;
	}
	public Person(String pname, float pheight, float pweight) {		//만들어준 생성자2
		Name = pname;
		height = pheight;
		weight = pweight;
	}
}
