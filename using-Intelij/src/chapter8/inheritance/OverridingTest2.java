package chapter8.inheritance;

public class OverridingTest2 {
    public static void main(String[] args) {
        Customer vc = new VIPCustomer(10030,"나몰라",2000);
        vc.bonusPoint = 1000;

        System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " + vc.calcPrice(10000) + " 입니다.");

        //상속에서 상위클래스와 하위클래스에 같은 이름의 메소드가 존재할 때 호출되는 메서드는 인스턴스에 따라 결정
        //선언한 클래스형이 아닌 인스턴스에 따라 결정
        //이 경우 vc는 Customer로 선언하였지만 vc인스턴스는 VIPCustomer 이므로 VIP의 메서드를 호출
        //이렇게 인스턴스의 메서드가 호출되는 것을 가상메서드(virtual method) 라고 한다
    }
}
