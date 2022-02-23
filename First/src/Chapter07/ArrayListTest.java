package Chapter07;
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args)
	{
		ArrayList<Book> lib = new ArrayList<Book>();
		
		lib.add(new Book("����","����Ű"));
		lib.add(new Book("��Ģ����","���ø���"));
		lib.add(new Book("â�Ǽ��� �����϶�","�Ȼ�"));
		lib.add(new Book("Ư�����̿´�","����Ŀ�����"));
		lib.add(new Book("�����","�������丮"));
		
		for(int i=0;i<lib.size();i++)
		{
			Book book = lib.get(i);
			book.showInfo();
		}
		System.out.println();
		
		System.out.println("===���� for�� ���===");
		for(Book book : lib)
		{
			book.showInfo();
		}
	}

}
