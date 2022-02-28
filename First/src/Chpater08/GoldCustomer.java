package Chpater08;

public class GoldCustomer extends Customer {
	double saleRatio;
	
	public GoldCustomer(int num, String str)
	{
		super(num,str);
		Grade = "Gold";
		Ratio = 0.02;
		saleRatio = 0.1;
	}
	
	public int calcPrice(int price)
	{
		Point += price * Ratio;
		return price - (int)(price * saleRatio);
	}

}
