package Chpater08;

public class OverridingTest3 {
	public static void main(String[] args)
	{
		int price = 10000;
		
		Customer lee = new Customer(10010,"��â��");
		System.out.println(lee.getCustomerName() + "���� ������ �ݾ���" + lee.calcPrice(price) + "�Դϴ�");
	
		VIPCustomer kim = new VIPCustomer(10020,"�赿��",100);
		System.out.println(kim.getCustomerName() + "���� ������ �ݾ���" + kim.calcPrice(price) + "�Դϴ�");
		
		Customer vc = new VIPCustomer(10030,"��?��?",200);
		System.out.println(vc.getCustomerName() + "���� ������ �ݾ���" + vc.calcPrice(price) + "�Դϴ�");
	}

}
