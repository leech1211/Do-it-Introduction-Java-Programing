package Chapter06;

public class Bus {
	int busNumber;			//������ȣ
	int passengerCount;		//�°� �� 
	int money;				//���� ����
	
	public Bus(int num) {		//������ȣ�� �޴� ������
		this.busNumber = num;
	}
	
	public void take(int money)
	{
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(this.busNumber+"�� ������ �°���"+this.passengerCount+"���̰� ������"
				+this.money+"���Դϴ�");
	}

}
