package Chapter02;

public class ExplictConversion {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;	//각각 형변환되어 더해짐
		int iNum4 = (int)(dNum1 + fNum2);		//먼저 더해져서 형변봔
		
		System.out.println(iNum3);
		System.out.println(iNum4);

	}

}
