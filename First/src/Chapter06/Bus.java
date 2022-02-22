package Chapter06;

public class Bus {
	int busNumber;			//버스번호
	int passengerCount;		//승객 수 
	int money;				//버스 수입
	
	public Bus(int num) {		//버스번호를 받는 생성자
		this.busNumber = num;
	}
	
	public void take(int money)
	{
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(this.busNumber+"번 버스의 승객은"+this.passengerCount+"명이고 수입은"
				+this.money+"원입니다");
	}

}
