package Chpater08;

public class OverridingTest2 {
	public static void main(String[] args)
	{
		Customer vc = new VIPCustomer(10030,"������",2000);	//VIP�� ����
		vc.Point = 1000;
		
		System.out.println(vc.getCustomerName() + "���� ������ �ݾ���" + vc.calcPrice(10000) + "�Դϴ�");
	}

}
