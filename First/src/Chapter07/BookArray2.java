package Chapter07;

public class BookArray2 {
	public static void main(String[] args)
	{
		Book[] lib = new Book[5];
		
		lib[0] = new Book("태백산맥","조정래");		//이렇게해야 인스턴스가 생성되고 배열에 저장됨
		lib[1] = new Book("데미안","헤르만 헤세");
		lib[2] = new Book("창의성을 지휘하라","픽사");
		lib[3] = new Book("규칙없음","넷플릭스");
		lib[4] = new Book("어린왕자","생택쥐페리");
		
		for(int i=0;i<lib.length;i++)
		{
			lib[i].showInfo();
		}
		System.out.println();
		for(int i=0;i<lib.length;i++)		//메모리공간의 주소
		{
			System.out.println(lib[i]);
		}
	}

}
