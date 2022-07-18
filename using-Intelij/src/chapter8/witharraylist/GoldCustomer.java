package chapter8.witharraylist;

public class GoldCustomer extends Customer {
    double saleRatio;

    public GoldCustomer(int id, String n){
        super(id,n);
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
}
