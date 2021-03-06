package Chpater08;

public class Customer {
	protected int ID;		//아이디
	protected String Name;	//이름
	protected String Grade;	//등급
	int Point;		//포인트
	double Ratio;	//적립비율
	
	public Customer() {		//default constructor
		initCustomer();
	}
	
	public Customer(int num, String s) {		//new constructor
		this.ID = num;
		this.Name = s;
		Grade = "silver";
		Ratio = 0.01;
		//System.out.println("Customer(int, String) constructor create");
		initCustomer();
	}
	
	private void initCustomer(){
		Grade = "silver";
		Ratio = 0.01;
	}
	
	public int calcPrice(int price)		//포인트 적립, 지불가격 계산 메소드
	{
		Point += price * Ratio;
		return price;
	}
	
	public String showCustomerInfo() {
		return Name + "님의 등급은" + Grade + "이며, 포인트는" + Point + "입니다";
	}

	public int getCustomerID() {
		return ID;
	}
	
	public void setCustomerID(int s) {
		this.ID = s;
	}
	
	public String getCustomerName() {
		return Name;
	}
	
	public void setCustomerName(String s) {
		this.Name = s;
	}
	
	public String getCustomerGrade() {
		return Grade;
	}
	
	public void setCustomerGrade(String s) {
		this.Grade = s;
	}
}
