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
		System.out.println("�ýù�ȣ"+this.number+"�� �°���"+this.passengerCount+"���̰� ���ϼ�����"
				+money+"�Դϴ�");
	}

}
