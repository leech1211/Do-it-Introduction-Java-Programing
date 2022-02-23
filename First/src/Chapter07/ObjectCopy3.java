package Chapter07;

public class ObjectCopy3 {
	public static void main(String[] args)
	{
		Book[] arr1 = new Book[3];
		Book[] arr2 = new Book[3];
		
		arr1[0] = new Book("슈독","나이키");
		arr1[1] = new Book("코스모스","칼세이건");
		arr1[2] = new Book("규칙없음","넷플릭스");
		
		arr2[0] = new Book();	//default constructor로 인스턴스 생성
		arr2[1] = new Book();
		arr2[2] = new Book();
		
		for(int i=0;i<arr2.length;i++)	//인스턴스 복사
		{
			arr2[i].setBookName(arr1[i].getBookName());
			arr2[i].setAuthor(arr1[i].getAuthor());
		}
		for(int i=0;i<arr2.length;i++)	//arr2출력
		{
			arr2[i].showInfo();
		}
		arr1[0].setBookName("특이점이 온다");
		arr1[0].setAuthor("레이커즈와일");
		
		System.out.println("===arr1===");
		for(int i=0;i<arr1.length;i++)	//arr1출력
		{
			arr1[i].showInfo();
		}
		
		System.out.println("===arr2===");
		for(int i=0;i<arr2.length;i++)	//arr2출력
		{
			arr2[i].showInfo();
		}
	}

}
