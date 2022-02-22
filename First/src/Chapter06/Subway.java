package Chapter06;

public class Subway {
	int subwayLine;			//몇호선
	int passengerCount;		//승객 수 
	int money;				//버스 수입
	
	public Subway(int num) {		//몇호선인지를 받는 생성자
		this.subwayLine = num;
	}
	
	public void take(int money)
	{
		this.money += money;
		this.passengerCount++;
	}
	public void showInfo() {
		System.out.println(this.subwayLine+"호선의 승객은"+this.passengerCount+"명이고 수입은"
				+this.money+"원입니다");
	}

}
