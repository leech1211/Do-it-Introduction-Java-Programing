package Chpater08;
import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args)
	{
//		Customer lee = new Customer();
//		lee.setCustomerID(10010);
//		lee.setCustomerName("이창훈");
//		lee.Point = 1000;
//		
//		System.out.println(lee.showCustomerInfo());
//		
//		Customer kim = new VIPCustomer(10020,"김유신",12345);
//		kim.Point = 1000;
//		
//		System.out.println(kim.showCustomerInfo());
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer lee = new Customer(10010,"이창훈");
		Customer park = new Customer(10020,"박병휴");
		Customer so = new GoldCustomer(10030,"이소미");
		Customer dong = new GoldCustomer(10040,"이동훈");
		Customer gyu = new VIPCustomer(10050,"이규성",12345);
		Customer si = new VIPCustomer(10060,"박시현",98765);
		
		customerList.add(lee);
		customerList.add(park);
		customerList.add(so);
		customerList.add(dong);
		customerList.add(gyu);
		customerList.add(si);
		
		System.out.println("===== 고객정보 출력 =====");
		for(Customer a : customerList)
		{
			System.out.println(a.showCustomerInfo());
		}		
		
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		
		int price = 10000;
		for(Customer a : customerList)
		{
			int cost = a.calcPrice(price);
			System.out.println(a.getCustomerName() + "님이" + cost + "원을 지불하셨습니다");
			System.out.println(a.getCustomerName() + "님의 현재포인트는" + a.Point + "점입니다");
		}
		
//		int leePrice = lee.calcPrice(price);
//		int kimPrice = kim.calcPrice(price);
//		
//		System.out.println(lee.getCustomerName() + "님이" + leePrice + "원 지불하였습니다");
//		System.out.println(kim.getCustomerName() + "님이" + kimPrice + "원 지불하였습니다");
//		System.out.println(kim.showCustomerInfo());
	}

}
