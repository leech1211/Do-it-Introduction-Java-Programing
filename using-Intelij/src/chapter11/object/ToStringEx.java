package chapter11.object;


class Book{
    int bookNumber;
    String bookTitle;

    Book(int n, String t)
    {
        bookNumber = n;
        bookTitle = t;
    }

    @Override
    public String toString()
    {
        return bookTitle + "," + bookNumber;
    }
}




public class ToStringEx {
    public static void main(String[] args) {
        Book Book1 = new Book(200,"개미");

        System.out.println(Book1);
        System.out.println(Book1.toString());
    }
}
