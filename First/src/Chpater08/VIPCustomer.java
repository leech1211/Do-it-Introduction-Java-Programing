package Chpater08;

public class VIPCustomer extends Customer {
	private int agentID; 	//VIP 고객 상담원 아이디
	double saleRatio;		//할인율
	
//	public VIPCustomer() {
//		Grade = "VIP";		
//		Ratio = 0.05;
//		saleRatio = 0.1;
//		System.out.println("VIPCustomer() constructor create");
//	}
	
	public VIPCustomer(int num, String name, int agent) {
		super(num,name);		//상위클래스 constructor 호출
		Grade = "VIP";		
		Ratio = 0.05;
		saleRatio = 0.1;
		this.agentID = agent;
		//System.out.println("VIPCustomer(int String) constructor create");
	}
	
	//@Override
	public int calcPrice(int price) {
		Point += price * Ratio;		//포인트 적립
		return price - (int)(price * saleRatio); //할인된 가격 반환
		
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원은" + agentID + "입니다";
	}
	
	public int getAgentID() {
		return agentID;
	}
}
