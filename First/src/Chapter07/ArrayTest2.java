package Chapter07;

public class ArrayTest2 {
	public static void main(String[] args)
	{
		double[] data = new double[5];		//��� ��� 0.0���� �ʱ�ȭ
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i]);
		}
	}

}
