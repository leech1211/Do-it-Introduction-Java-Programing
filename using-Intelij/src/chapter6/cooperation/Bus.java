package chapter6.cooperation;

public class Bus {
    int busNumber;          //버스번호
    int passengerCount;     //승객 수
    int money;              //버스 수입

    public Bus(int busnumber)
    {
        this.busNumber = busnumber;
    }

    public void take(int m)
    {
        this.money += m;
        this.passengerCount++;
    }

    public void showInfo()
    {
        System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고 수입은 " + money + "입니다.");
    }

}
