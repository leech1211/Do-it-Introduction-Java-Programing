package Chpater08;

public class Customer {
	protected int ID;		//���̵�
	protected String Name;	//�̸�
	protected String Grade;	//���
	int Point;		//����Ʈ
	double Ratio;	//��������
	
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
	
	public int calcPrice(int price)		//����Ʈ ����, ���Ұ��� ��� �޼ҵ�
	{
		Point += price * Ratio;
		return price;
	}
	
	public String showCustomerInfo() {
		return Name + "���� �����" + Grade + "�̸�, ����Ʈ��" + Point + "�Դϴ�";
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
