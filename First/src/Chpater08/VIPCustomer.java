package Chpater08;

public class VIPCustomer extends Customer {
	private int agentID; 	//VIP �� ���� ���̵�
	double saleRatio;		//������
	
//	public VIPCustomer() {
//		Grade = "VIP";		
//		Ratio = 0.05;
//		saleRatio = 0.1;
//		System.out.println("VIPCustomer() constructor create");
//	}
	
	public VIPCustomer(int num, String name, int agent) {
		super(num,name);		//����Ŭ���� constructor ȣ��
		Grade = "VIP";		
		Ratio = 0.05;
		saleRatio = 0.1;
		this.agentID = agent;
		//System.out.println("VIPCustomer(int String) constructor create");
	}
	
	//@Override
	public int calcPrice(int price) {
		Point += price * Ratio;		//����Ʈ ����
		return price - (int)(price * saleRatio); //���ε� ���� ��ȯ
		
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "��� ������" + agentID + "�Դϴ�";
	}
	
	public int getAgentID() {
		return agentID;
	}
}
