package Chapter07;
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args)
	{
		ArrayList<Book> lib = new ArrayList<Book>();
		
		lib.add(new Book("슈독","나이키"));
		lib.add(new Book("규칙없음","넷플릭스"));
		lib.add(new Book("창의성을 지휘하라","픽사"));
		lib.add(new Book("특이점이온다","레이커즈와일"));
		lib.add(new Book("어린상자","생택쥐페리"));
		
		for(int i=0;i<lib.size();i++)
		{
			Book book = lib.get(i);
			book.showInfo();
		}
		System.out.println();
		
		System.out.println("===향상된 for문 사용===");
		for(Book book : lib)
		{
			book.showInfo();
		}
	}

}
