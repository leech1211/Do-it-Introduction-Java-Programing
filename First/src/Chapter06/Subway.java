package Chapter06;

public class Subway {
	int subwayLine;			//��ȣ��
	int passengerCount;		//�°� �� 
	int money;				//���� ����
	
	public Subway(int num) {		//��ȣ�������� �޴� ������
		this.subwayLine = num;
	}
	
	public void take(int money)
	{
		this.money += money;
		this.passengerCount++;
	}
	public void showInfo() {
		System.out.println(this.subwayLine+"ȣ���� �°���"+this.passengerCount+"���̰� ������"
				+this.money+"���Դϴ�");
	}

}
