package chapter8.inheritance;

public class VIPCustomer extends Customer{
    private int agentID;        //고객 상담원 아이디
    double saleRatio;           //할인율

   /* public VIPCustomer()
    {
        customerGrade = "VIP";      //private이라 오류발생
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer() 생성자 호출");
    }*/

    public VIPCustomer(int i, String n, int ai)
    {
        super(i,n); //상위클래스의 생성자 호출
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = ai;
        //System.out.println("VIPCustomer(int , String) 생성자 호출");

    }

    @Override       //애노테이션 '이 메소드는 재정의된 매소드 입니다'
    public int calcPrice(int price)
    {
        bonusPoint += price * bonusRatio;           //보너스 적립금 적림
        return price - (int)(price * saleRatio);    //할인된 가격을 계산하여 반환
    }
    //애노테이션
    //컴파일러에게 특정정보 제공
    /*
    *  표준 애노테이션
    *
    * @Override - 재정의된 매서드
    * @FuntionalInterface - 함수형 인터페이스
    * @Deprecated - 이후 버전에서 사용되지 않을 수 있는 변수, 메서드에 사용됨
    * @SuppressWarnings - 특정경고가 나타나지 않게 함
    *
    * */


    public int getAgentID()
    {
        return agentID;
    }
}
