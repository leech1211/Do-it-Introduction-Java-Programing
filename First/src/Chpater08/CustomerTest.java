package Chpater08;
import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args)
	{
//		Customer lee = new Customer();
//		lee.setCustomerID(10010);
//		lee.setCustomerName("��â��");
//		lee.Point = 1000;
//		
//		System.out.println(lee.showCustomerInfo());
//		
//		Customer kim = new VIPCustomer(10020,"������",12345);
//		kim.Point = 1000;
//		
//		System.out.println(kim.showCustomerInfo());
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer lee = new Customer(10010,"��â��");
		Customer park = new Customer(10020,"�ں���");
		Customer so = new GoldCustomer(10030,"�̼ҹ�");
		Customer dong = new GoldCustomer(10040,"�̵���");
		Customer gyu = new VIPCustomer(10050,"�̱Լ�",12345);
		Customer si = new VIPCustomer(10060,"�ڽ���",98765);
		
		customerList.add(lee);
		customerList.add(park);
		customerList.add(so);
		customerList.add(dong);
		customerList.add(gyu);
		customerList.add(si);
		
		System.out.println("===== ������ ��� =====");
		for(Customer a : customerList)
		{
			System.out.println(a.showCustomerInfo());
		}		
		
		System.out.println("===== �������� ���ʽ� ����Ʈ ��� =====");
		
		int price = 10000;
		for(Customer a : customerList)
		{
			int cost = a.calcPrice(price);
			System.out.println(a.getCustomerName() + "����" + cost + "���� �����ϼ̽��ϴ�");
			System.out.println(a.getCustomerName() + "���� ��������Ʈ��" + a.Point + "���Դϴ�");
		}
		
//		int leePrice = lee.calcPrice(price);
//		int kimPrice = kim.calcPrice(price);
//		
//		System.out.println(lee.getCustomerName() + "����" + leePrice + "�� �����Ͽ����ϴ�");
//		System.out.println(kim.getCustomerName() + "����" + kimPrice + "�� �����Ͽ����ϴ�");
//		System.out.println(kim.showCustomerInfo());
	}

}
