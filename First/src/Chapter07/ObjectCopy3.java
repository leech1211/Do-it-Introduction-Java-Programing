package Chapter07;

public class ObjectCopy3 {
	public static void main(String[] args)
	{
		Book[] arr1 = new Book[3];
		Book[] arr2 = new Book[3];
		
		arr1[0] = new Book("����","����Ű");
		arr1[1] = new Book("�ڽ���","Į���̰�");
		arr1[2] = new Book("��Ģ����","���ø���");
		
		arr2[0] = new Book();	//default constructor�� �ν��Ͻ� ����
		arr2[1] = new Book();
		arr2[2] = new Book();
		
		for(int i=0;i<arr2.length;i++)	//�ν��Ͻ� ����
		{
			arr2[i].setBookName(arr1[i].getBookName());
			arr2[i].setAuthor(arr1[i].getAuthor());
		}
		for(int i=0;i<arr2.length;i++)	//arr2���
		{
			arr2[i].showInfo();
		}
		arr1[0].setBookName("Ư������ �´�");
		arr1[0].setAuthor("����Ŀ�����");
		
		System.out.println("===arr1===");
		for(int i=0;i<arr1.length;i++)	//arr1���
		{
			arr1[i].showInfo();
		}
		
		System.out.println("===arr2===");
		for(int i=0;i<arr2.length;i++)	//arr2���
		{
			arr2[i].showInfo();
		}
	}

}
