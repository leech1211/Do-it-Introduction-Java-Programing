package Chpater08;

public class CustomerTest2 {
	public static void main(String[] args)
	{
		VIPCustomer kim = new VIPCustomer(10020,"������",10);
//		kim.setCustomerID(10020);
//		kim.setCustomerName("������");
		kim.Point = 10000;
		System.out.println(kim.showCustomerInfo());
	}

}
