package Chapter07;

public class ObjectCopy2 {
	public static void main(String[] args)
	{
		Book[] arr1 = new Book[3];
		Book[] arr2 = new Book[3];
		
		arr1[0] = new Book("����","����Ű");
		arr1[1] = new Book("�ڽ���","Į���̰�");
		arr1[2] = new Book("��Ģ����","���ø���");
		System.arraycopy(arr1, 0, arr2, 0, 3);
		
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i].showInfo();
		}
		
		System.out.println("=== arr1 ===");			//arr1�� ����������
		arr1[0].setBookName("Ư������ �´�");
		arr1[0].setAuthor("����Ŀ�����");
		
		System.out.println("=== arr2 ===");			//arr2�� ����Ǿ���
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i].showInfo();
		}
		//���������̱⶧��
		//��ü�迭�� ����� ���� �ν��Ͻ� ���䰡 �ƴ� �ν��Ͻ��� �ּҰ��̱⶧��
		//�ι迭 ��� ���� �ν��Ͻ��� ����Ű�� �ֱ⿡ �� �迭 ��� ������ ����
	}

}
