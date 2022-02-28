package Chpater08;

public class OverridingTest3 {
	public static void main(String[] args)
	{
		int price = 10000;
		
		Customer lee = new Customer(10010,"이창훈");
		System.out.println(lee.getCustomerName() + "님이 지불할 금액은" + lee.calcPrice(price) + "입니다");
	
		VIPCustomer kim = new VIPCustomer(10020,"김동훈",100);
		System.out.println(kim.getCustomerName() + "님이 지불할 금액은" + kim.calcPrice(price) + "입니다");
		
		Customer vc = new VIPCustomer(10030,"몰?루?",200);
		System.out.println(vc.getCustomerName() + "님이 지불할 금액은" + vc.calcPrice(price) + "입니다");
	}

}
