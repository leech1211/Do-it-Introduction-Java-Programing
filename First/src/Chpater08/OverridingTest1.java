package Chpater08;

public class OverridingTest1 {
	public static void main(String[] args)
	{
		Customer lee = new Customer(10100,"��â��");
		lee.Point = 1000;
		
		VIPCustomer lee2 = new VIPCustomer(10200,"�̵���",101);
		lee2.Point = 10000;
		
		int price = 10000;
		System.out.println(lee.showCustomerInfo() + "���� ������ �ݾ���" + lee.calcPrice(price) + "���Դϴ�");
		System.out.println(lee2.showCustomerInfo() + "���� ������ �ݾ���" + lee2.calcPrice(price) + "���Դϴ�");
	}

}
