package Chapter06;

public class Texi {
	public int number;
	public int passengerCount;
	public int money;
	
	public Texi(int num){
		this.number = num;
	}
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	public void showInfo() {
		System.out.println("택시번호"+this.number+"의 승객은"+this.passengerCount+"명이고 금일수입은"
				+money+"입니다");
	}

}
