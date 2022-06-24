package chapter7.array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> lib = new ArrayList<Book>();

        lib.add(new Book("슈독","필나이트"));
        lib.add(new Book("규칙없음","에린 마이어"));
        lib.add(new Book("특이점이 온다","레이커즈 와일"));
        lib.add(new Book("창의성을 지휘하라","에드 캣멀"));
        lib.add(new Book("창조력코드","마커스 드 사토이"));

         for(int i=0;i<lib.size();i++)
         {
             Book book = lib.get(i);
             book.showBookInfo();
         }
        System.out.println();

        System.out.println("=== improved for loog ===");
        for(Book b : lib)
        {
            b.showBookInfo();
        }
    }
}
