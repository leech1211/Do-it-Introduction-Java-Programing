package Chapter07;

public class BookArray2 {
	public static void main(String[] args)
	{
		Book[] lib = new Book[5];
		
		lib[0] = new Book("�¹���","������");		//�̷����ؾ� �ν��Ͻ��� �����ǰ� �迭�� �����
		lib[1] = new Book("���̾�","�츣�� �켼");
		lib[2] = new Book("â�Ǽ��� �����϶�","�Ȼ�");
		lib[3] = new Book("��Ģ����","���ø���");
		lib[4] = new Book("�����","�������丮");
		
		for(int i=0;i<lib.length;i++)
		{
			lib[i].showInfo();
		}
		System.out.println();
		for(int i=0;i<lib.length;i++)		//�޸𸮰����� �ּ�
		{
			System.out.println(lib[i]);
		}
	}

}
