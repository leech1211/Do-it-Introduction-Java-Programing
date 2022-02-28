package Chpater08;

public class OverridingTest2 {
	public static void main(String[] args)
	{
		Customer vc = new VIPCustomer(10030,"나몰라",2000);	//VIP고객 생성
		vc.Point = 1000;
		
		System.out.println(vc.getCustomerName() + "님이 지불할 금액은" + vc.calcPrice(10000) + "입니다");
	}

}
