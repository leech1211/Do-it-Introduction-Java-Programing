package chapter7.array;

public class ObjectCopy2 {
    public static void main(String[] args) {
        Book[] bookArr1 = new Book[3];
        Book[] bookArr2 = new Book[3];

        bookArr1[0] = new Book("슈독", "필나이트");
        bookArr1[1] = new Book("창의성을 지휘하라", "에드 캣멀");
        bookArr1[2] = new Book("규칙없음", "에린 마이어");

        System.arraycopy(bookArr1,0,bookArr2,0,3);
        for(int i=0;i< bookArr2.length;i++)
        {
            bookArr2[i].showBookInfo();
        }

        System.out.println("=== bookArray1 ===");
        bookArr1[0].setBookName("나목");
        bookArr1[0].setAuthor("박완서");

        System.out.println("=== bookArray2 ===");
        for(int i=0;i< bookArr2.length;i++)
        {
            bookArr2[i].showBookInfo();
        }
    }
}
