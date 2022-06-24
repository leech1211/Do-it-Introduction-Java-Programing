package chapter7.array;

public class BookArray2 {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book("슈독", "필 나이트");
        library[1] = new Book("창의성을 지휘하라", "에드 캣멀");
        library[2] = new Book("규칙없음", "에린 마이어");
        library[3] = new Book("특이점이 온다", "레이커즈 와일");
        library[4] = new Book("창조력코드", "마커스 드 사토이");

        for(int i=0; i < library.length; i++)
        {
           library[i].showBookInfo();
        }

        for(int i=0; i < library.length; i++)
        {
            System.out.println(library[i]);
        }
    }
}
