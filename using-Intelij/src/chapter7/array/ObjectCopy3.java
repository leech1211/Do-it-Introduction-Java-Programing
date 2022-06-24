package chapter7.array;

public class ObjectCopy3 {
    public static void main(String[] args) {
        Book[] arr1 = new Book[3];
        Book[] arr2 = new Book[3];

        arr1[0] = new Book("슈독", "필나이트");
        arr1[1] = new Book("창의성을 지휘하라", "에드 캣멀");
        arr1[2] = new Book("규칙없음", "에린 마이어");

        arr2[0] = new Book();
        arr2[1] = new Book();
        arr2[2] = new Book();

        for(int i=0;i<arr1.length;i++)
        {
            arr2[i].setBookName(arr1[i].getBookName());
            arr2[i].setAuthor(arr1[i].getAuthor());
        }

        for(int i=0;i< arr2.length;i++)
        {
            arr2[i].showBookInfo();
        }

        arr1[0].setAuthor("박완서");
        arr1[0].setBookName("나목");
        System.out.println("===BookArray1===");

        for(int i=0;i< arr1.length;i++)
        {
            arr1[i].showBookInfo();
        }

        System.out.println("===BookArray2===");

        for(int i=0;i< arr2.length;i++)
        {
            arr2[i].showBookInfo();
        }
    }
}
