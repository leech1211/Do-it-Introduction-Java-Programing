package Chapter07;

public class ArrayCopy {
	public static void main(String[] args)
	{
		int []arr1 = {10,20,30,40,50};
		int []arr2 = {1,2,3,4,5};
		
		System.arraycopy(arr1, 0, arr2, 1, 4);
		//     ������ �迭,������ ù��ġ, ���迭,�ٿ����� ù��ġ,�����ҿ�� ����
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
	}

}
