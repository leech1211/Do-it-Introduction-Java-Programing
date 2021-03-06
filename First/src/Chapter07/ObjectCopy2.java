package Chapter07;

public class ObjectCopy2 {
	public static void main(String[] args)
	{
		Book[] arr1 = new Book[3];
		Book[] arr2 = new Book[3];
		
		arr1[0] = new Book("슈독","나이키");
		arr1[1] = new Book("코스모스","칼세이건");
		arr1[2] = new Book("규칙없음","넷플릭스");
		System.arraycopy(arr1, 0, arr2, 0, 3);
		
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i].showInfo();
		}
		
		System.out.println("=== arr1 ===");			//arr1만 변경했으나
		arr1[0].setBookName("특이점이 온다");
		arr1[0].setAuthor("레이커즈와일");
		
		System.out.println("=== arr2 ===");			//arr2도 변경되었음
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i].showInfo();
		}
		//얕은복사이기때문
		//객체배열에 저장된 값은 인스턴스 자페가 아닌 인스턴스의 주소값이기때문
		//두배열 모두 같은 인스턴스를 가리키고 있기에 두 배열 모두 영향을 받음
	}

}
