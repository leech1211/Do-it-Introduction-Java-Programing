package Chpater08;

public class CustomerTest1 {
	public static void main(String[] args)
	{
		Customer lee = new Customer(10010,"�̼���");
//		lee.setCustomerID(10010);
//		lee.setCustomerName("�̼���");
		lee.Point = 1000;
		System.out.println(lee.showCustomerInfo());
		
		
			VIPCustomer kim = new VIPCustomer(10020,"������",10);
//			kim.setCustomerID(10020);
//			kim.setCustomerName("������");
			kim.Point = 10000;
			System.out.println(kim.showCustomerInfo());
		
	}

}
