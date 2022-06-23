package chapter6.cooperation;

public class Subway {

    String lineNumber;      //노선
    int passengerCount;     //승객
    int money;              //돈

    public Subway(String n)
    {
        this.lineNumber = n;
    }

    public void take(int m)
    {
        this.money += m;
        passengerCount++;
    }

    public void showInfo()
    {
        System.out.println(lineNumber + "의 승객 수는" + passengerCount + "명 이며 수입은 " + money + "원 입니다.");
    }
}
