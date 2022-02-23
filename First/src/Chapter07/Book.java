package Chapter07;

public class Book {
	private String Name;
	private String Author;
	
	public Book() {} 	//default constructor
	public Book(String bookname, String man)
	{
		this.Name = bookname;
		this.Author = man;
	}
	public String getBookName() {
		return Name;
	}
	public void setBookName(String s) {
		this.Name = s;
	}
	public String getAuthor() {
		return Author;
	}
	
	public void setAuthor(String s)
	{
		this.Author = s;
	}
	public void showInfo() {
		System.out.println("BookName: "+this.Name);
		System.out.println("Author: "+this.Author);
	}

}
