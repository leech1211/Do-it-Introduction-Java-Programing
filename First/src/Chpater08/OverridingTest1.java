package Chpater08;

public class OverridingTest1 {
	public static void main(String[] args)
	{
		Customer lee = new Customer(10100,"이창훈");
		lee.Point = 1000;
		
		VIPCustomer lee2 = new VIPCustomer(10200,"이동훈",101);
		lee2.Point = 10000;
		
		int price = 10000;
		System.out.println(lee.showCustomerInfo() + "님이 지불할 금액은" + lee.calcPrice(price) + "원입니다");
		System.out.println(lee2.showCustomerInfo() + "님이 지불할 금액은" + lee2.calcPrice(price) + "원입니다");
	}

}
