package chapter8.witharraylist;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer()
    {
        initCustomer();
    }

    public Customer(int id, String n)
    {
        this.customerID = id;
        this.customerName = n;
        initCustomer();
    }

    private void initCustomer() {
        customerGrade = "SIVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName + " 님의 등급은 " + customerGrade + " 이며, 보너스 포인트는" + bonusPoint + "입니다.";
    }


    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getCustomerName() {
        return customerName;
    }
}

