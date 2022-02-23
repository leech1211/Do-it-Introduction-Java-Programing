package Chapter07;

public class BookArray {
	public static void main(String[] args)
	{
		Book[] lib = new Book[5];		//이경우에 인스턴스의 주소값만 할당됨 BookArray2 ㄱㄱ
		
		for(int i=0;i<lib.length;i++)
		{
			System.out.println(lib[i]);
		}
	}

}
