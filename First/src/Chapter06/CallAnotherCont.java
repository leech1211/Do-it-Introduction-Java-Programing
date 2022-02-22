package Chapter06;

class person{
	String name;
	int age;
	
	person(){
		this("이름없음",1);		//이줄이 밑에있는 생성자를 호출
	}
	
	person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	person returnItSelf() {
		return this;
	}
}

public class CallAnotherCont {
	public static void main(String[] args)
	{
		person noName = new person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
		
	}

}
